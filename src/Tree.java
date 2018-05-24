import java.util.List;

public class Tree {

  public Node linkNode(Node node, Node parrent){
    node.setParent(parrent);
    List<Node> childs = parrent.getChilds();
    childs.add(node);
    node.setChilds(childs);
    return node;
  }

  public Node traverseAndFind(Node root, int searchProductId){
    Node trRoot =  root;
    if(trRoot == null || trRoot.getChilds().isEmpty()){
      return trRoot;
    }
    if(trRoot.getId() == searchProductId){
      return trRoot;
    }
    List<Node> nodeList = root.getChilds();

    for (Node node : nodeList) {
      traverseAndFind(node,searchProductId);
    }
    return null;
  }


  public void applyPercentDiscount(Node root, int id, int perDisc){
    Node nodeFound = traverseAndFind(root,id);
    if (nodeFound.getPrice() == -1){
      for (Node node : nodeFound.getChilds()) {
        if (node.getPrice() != -1 && !node.getChilds().isEmpty()){
          applyPercentDiscount(node,id,perDisc);
        }
        else {
          System.out.println("DISCOUNTED PRICE for "+ nodeFound.getName()+" : " +nodeFound.getPrice()*(perDisc/100));
        }
      }
    }
    else{
      System.out.println("DISCOUNTED PRICE for "+ nodeFound.getName()+" : " +nodeFound.getPrice()*(perDisc/100));
    }
  }

  public void deleteNode(Node root, int id){
   Node node = traverseAndFind(root,id);
   if(node!=null)
     node.setParent(null);
  }


}

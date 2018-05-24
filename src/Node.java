import java.util.ArrayList;
import java.util.List;

public class Node {
  int id;
  String name;
  double price;
  Node parent;
  List<Node> childs;

  public Node(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.parent = null;
    childs = new ArrayList<>();
  }
  public Node() {
    this.id = -1;
    this.name = "";
    this.price = -1;
  }

  public List<Node> getChilds() {
    return childs;
  }

  public void setChilds(List<Node> childs) {
    this.childs = childs;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

package ChainOfResponibility;

import java.util.ArrayList;
import java.util.List;

public class Product {
  String name;
  List<Boolean> stateList;

  public Product() {
  }

  public Product(String name) {
    this.name = name;
    this.stateList = new ArrayList<>();
    this.stateList.add(false);
    this.stateList.add(false);
    this.stateList.add(false);

  }

  void getState() {
    System.out.println("Product{" + "name=" + name + '}');
    System.out.println(stateList);
//    тоже самое:
//    for (int i = 0; i < this.stateList.size(); i++) {
//      System.out.println(i + " i " + this.stateList.get(i));
//     }


  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            '}';
  }
}

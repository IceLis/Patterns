package ChainOfResponibility;

public class Section implements ISection {
  String name;
  int state;
  ISection prev, next;

  Section() {
  }

  public Section(String name, int state) {
    this.name = name;
    this.state = state;
    this.next = null;
    this.prev = null;
  }

  @Override
  public void action(Product prod) {
    int falseCounter = 0;
    for (int i = 0; i < this.state; i++) {
      if (prod.stateList.get(i) == false) {
        falseCounter++;
      }
    }
    if (falseCounter == 0) {
      System.out.println("Section: " + '\"' + this.name + '\"' +
              " make action on product: " + prod.name);
      prod.stateList.set(this.state, true);
      if (this.next != null) {
        System.out.println("Section: " + '\"' + this.name + '\"' +
                " moves product to the next section");
        System.out.println();
        this.next.action(prod);
      } else {
        System.out.println("Chain completed");
      }
    } else {
      System.out.println("Section: " + '\"' + this.name + '\"' +
              " can't make action on product: " + prod.name);
      if (this.prev != null) {
        System.out.println("Section: " + '\"' + this.name + '\"' +
                         " moves product to the prev section");
        System.out.println();

        this.prev.action(prod);
      } else {
        System.out.println("Chain head completed");
      }
    }
  }
}

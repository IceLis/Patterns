package State;

public class Unit {
  private String name;
  IState iState;

  public Unit() {
  }

  public Unit(String name, IState iState) {
    this.name = name;
    this.iState = iState;
  }

  void unitWorks() {
    System.out.println("unit name: " + this.name);
//    System.out.println(this.iState.getClass());
    this.iState.action(this);
  }
}

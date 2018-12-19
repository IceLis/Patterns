package State;

public class UnitOn implements IState {
  @Override
  public void action(Unit unit) {
    System.out.println("unit on");
    unit.iState = new UnitWait();
    unit.unitWorks();
  }
}

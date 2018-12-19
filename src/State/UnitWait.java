package State;

public class UnitWait implements IState {
  @Override
  public void action(Unit unit) {
    System.out.println( "unit wait");
    unit.iState = new UnitAction();
    unit.unitWorks();

  }
}

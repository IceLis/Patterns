package State;

public class UnitBackup implements IState {
  @Override
  public void action(Unit unit)
  {
    System.out.println( "unit backup");
    unit.iState = new UnitOff();
    unit.unitWorks();
  }
}

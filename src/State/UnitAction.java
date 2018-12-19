package State;

public class UnitAction implements IState {
  @Override
  public void action(Unit unit) {
    System.out.println("unit action");
    unit.iState= new UnitBackup();
    unit.unitWorks();

  }
}

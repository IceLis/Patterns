package State;

public class UnitSleep implements IState {
  @Override
  public void action(Unit unit) {
    System.out.println( "unit sleep");
  }
}

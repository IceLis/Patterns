package State;

public class UnitOff implements IState {
  @Override
  public void action(Unit unit) {
    System.out.println( "unit off");
  }
}

package State;

public class MainState {
  public static void main(String[] args) {
//    IState onState = new UnitOn();
//    IState offState = new UnitOff();
//
//    UnitNewConnect unit = new UnitNewConnect("Copier", onState);
//    unit.unitWorks();
//    unit.iState = offState;
//    unit.unitWorks();
//
//    unit.iState =new UnitSleep();
//    unit.unitWorks();
//    unit.iState =new UnitWait();
//    unit.unitWorks();

    Unit unit= new Unit("Copier",new UnitOn());
    unit.unitWorks();
  }
}

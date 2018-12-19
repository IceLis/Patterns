package BridgeReminder;

public class PaySystem {
  ITransaction iTransaction;

  public PaySystem() {
  }

  public PaySystem(ITransaction iTransaction) {
    this.iTransaction = iTransaction;


  }
   public void getPay(){
     System.out.println("Make pay" + this.iTransaction.getOrganisation());
   }
}

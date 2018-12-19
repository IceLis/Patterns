package BridgeReminder;

public class PayPal implements ITransaction {
  @Override
  public String getOrganisation() {
    return "transaction by PayPal";
  }
}

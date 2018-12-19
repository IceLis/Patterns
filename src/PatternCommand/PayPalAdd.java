package PatternCommand;

public class PayPalAdd implements ICommand {
  private PayPal payPal;

  public PayPalAdd(PayPal payPal) {
    this.payPal = payPal;
  }

  @Override
  public void execute() {
    this.payPal.addByPayPal();
  }
}

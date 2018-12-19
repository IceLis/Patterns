package PatternCommand;

public class PayPalPay implements ICommand {
  private PayPal payPal;

  public PayPalPay(PayPal payPal) {
    this.payPal = payPal;
  }

  @Override
  public void execute() {
    this.payPal.payByPayPal();
  }
}

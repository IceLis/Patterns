package PatternCommand;

public class MainCommand {
  public static void main(String[] args) {
    PayPal payPal=new PayPal();
    Kiwi kiwi = new Kiwi();

    User user =new User(new KiwiPay(kiwi),new PayPalPay(payPal));
    user.userPay();
    user.userAdd();

  }
}

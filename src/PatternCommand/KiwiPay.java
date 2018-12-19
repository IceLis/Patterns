package PatternCommand;

public class KiwiPay implements ICommand{
  private Kiwi kiwi;

  public KiwiPay(Kiwi kiwi) {
    this.kiwi = kiwi;

  }

  @Override
  public void execute() {
    this.kiwi.payByKiwi();
  }
}

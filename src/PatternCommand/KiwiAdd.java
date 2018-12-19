package PatternCommand;

public class KiwiAdd implements ICommand{
  private Kiwi kiwi;

  public KiwiAdd(Kiwi kiwi) {
    this.kiwi = kiwi;

  }

  @Override
  public void execute() {

    this.kiwi.addByKiwi();
  }
}

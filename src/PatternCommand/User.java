package PatternCommand;

public class User {
  ICommand commandAdd;
  ICommand commandPay;

  public User(ICommand commandAdd, ICommand commandPay) {
    this.commandAdd = commandAdd;
    this.commandPay = commandPay;
  }

  public void userPay() {
this.commandPay.execute();
  }
  public  void userAdd(){
this.commandAdd.execute();
  }

}

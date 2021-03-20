package first_exercise;

public class CheckingAccountFlex extends CheckingAccount {
  
  public CheckingAccountFlex(double balance) {
    super(balance);
  }

  @Override
  public void deposit(double amount) {
    this.balance += (2 * amount);
  }
}

package first_exercise;

public class CheckingAccountGold extends CheckingAccount {
  
  public CheckingAccountGold(double balance) {
    super(balance);
  }

  @Override
  public void deposit(double amount) {
    this.balance += (3 * amount);
  }
}

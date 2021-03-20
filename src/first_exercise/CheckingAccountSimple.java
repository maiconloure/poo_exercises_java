package first_exercise;

public class CheckingAccountSimple  extends CheckingAccount {

  public CheckingAccountSimple(double balance) {
    super(balance);
  }

  @Override
  public void deposit(double amount) {
    this.balance += amount;
  }
}

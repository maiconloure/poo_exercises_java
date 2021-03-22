package first_exercise;

public class CheckingAccount {
  private int agency;
  private int account;
  protected double balance;

  public CheckingAccount(double balance) {
    this.balance = balance;
  }

  public int getAgency() { 
    return agency; 
  }

  public void setAgency(int agency) {
    this.agency = agency;
  }

  public int getAccount() {
    return account;
  }

  public void setAccount(int account) {
    this.account = account;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double amount) {
    this.balance = amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      this.balance -= amount;
    }
  }

  public void deposit(double amount) {
    this.balance += amount;
  }
}

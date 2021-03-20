package first_exercise;

public class Client {
  private String name;
  private String surname;
  private int age;
  private int CPF;
  private CheckingAccount account;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCPF() {
    return CPF;
  }

  public void setCPF(int CPF) {
    this.CPF = CPF;
  }

  public CheckingAccount getAccount() {
    return account;
  }

  public void setAccount(CheckingAccount account) {
    this.account = account;
  }

  public void withdraw(double amount) {
    account.withdraw(amount);
  }

  public void deposit(double amount) {
    account.deposit(amount);
  }

  public double balance() {
    return account.getBalance();
  }
}

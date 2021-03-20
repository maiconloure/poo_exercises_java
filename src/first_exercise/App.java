package first_exercise;

public class App {
  public static void main(String[] args) throws Exception {

    Client client = new Client();
    client.setName("Nippon");
    client.setSurname("Hyakkei");
    client.setAge(55);
    client.setCPF(123123131);
    client.setAccount(new CheckingAccount(100));
    CheckingAccount account = client.getAccount();
    account.deposit(250);

    System.out.println(account.getBalance());
  }
}

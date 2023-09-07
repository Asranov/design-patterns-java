public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.deposid(100);
        account.withdraw(50);
        System.out.println(account.getBalance());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 100.0);

        System.out.println("Начальний баланс: " + account.getBalance());

        account.deposit(50.0);
        System.out.println("Баланс після поповнення: " + account.getBalance());

        account.withdraw(30.0);
        System.out.println("Баланс після зняття: " + account.getBalance());

        account.withdraw(200.0);
    }
}
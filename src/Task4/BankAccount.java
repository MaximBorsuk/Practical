package Task4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Поповнення
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " депозит: " + amount);
        } else {
            System.out.println("Сума депозиту має бути позитивною");
        }
    }

    // Зняття готівки
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Недостатньо коштів для виведення");
        } else {
            System.out.println("Сума виведення має бути позитивною");
        }
    }

    // Отримання балансу
    public double getBalance() {
        return balance;
    }
}
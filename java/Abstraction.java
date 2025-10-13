
abstract class BankAccount {
    String accountHolder;
    double balance;
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void displayBalance() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account");
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account");
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from Current Account");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Sujata", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();
        System.out.println("-----------------------");
        BankAccount acc2 = new CurrentAccount("Rohan", 10000);
        acc2.deposit(3000);
        acc2.withdraw(15000);
        acc2.displayBalance();
    }
}

    


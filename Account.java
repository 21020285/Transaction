import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<String> money = new ArrayList<String>();
    private String deposit();
    private String withdraw();

    void deposit(double amount) {
        this.amount = amount;
    }

    void withdraw(double amount) {
        this.amount = amount;
    }

    public void addTransaction(double amount, String operation) {
        System.out.printf(“%.2f”, amount);

    }

    public void addTransaction() {
        Account acc= new Account();
        acc.addTransaction(2000.255,"deposit");
        acc.addTransaction(1000,"withdraw");
        acc.printTransaction();
    }


}

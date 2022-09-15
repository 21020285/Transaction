public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT;
    public static final String WITHDRAW;

    /**
     * create 3 nums.
     */

    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * getter for operation.
     */

    public String getOperation() {
        return operation;
    }

    /**
     * setter for operation.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * getter for amount.
     */

    public double getAmount() {
        return amount;
    }

    /**
     * setter for amount.
     */

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * getter for balance.
     */

    public double getBalance() {
        return balance;
    }

    /**
     * setter for balance.
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

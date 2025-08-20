package OOP.AbsractAndInterfaceUsage;

// Abstract Class: Defines the fundamental nature of a Bank Account.
// You can't just have a generic "account"; it must be a specific type.
public abstract class BankAccount {
    /*
    An abstract class in OOP allows us to define a common base for related classes.
    It lets us reuse code that all subclasses share (like fields and default methods),
    while also forcing subclasses to implement specific behaviors through abstract methods.
    It supports encapsulation by hiding sensitive details from subclasses using access modifiers
    (private, protected, etc.). This way, we get both code reuse and a clear contract for specialization
     */

    // Shared STATE (data) for all accounts
    private String accountNumber;
    private String accountHolderName;
    protected double balance; // protected so subclasses can access it

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount(){}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Shared BEHAVIOR (methods) with actual code
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("DEPOSIT", amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    // A common method with a default implementation
    protected void logTransaction(String type, double amount) {
        System.out.println(type + " of $" + amount + " to " + accountNumber + ". New Balance: $" + balance);
    }

    // Abstract methods: Rules that all accounts must follow but implement differently.
    public abstract void withdraw(double amount);
    public abstract void applyMonthlyFees();
}



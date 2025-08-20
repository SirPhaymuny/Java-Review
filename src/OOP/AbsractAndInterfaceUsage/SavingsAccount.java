package OOP.AbsractAndInterfaceUsage;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        // Specific rule for Savings: Cannot overdraw
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logTransaction("WITHDRAWAL", amount);
        }
    }

    @Override
    public void applyMonthlyFees() {
        // Savings accounts might get interest instead of fees
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }
}

package OOP.AbsractAndInterfaceUsage;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    public CheckingAccount(){
        super();
    }

    @Override
    public void withdraw(double amount) {
        // Specific rule for Checking: Can use overdraft
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            logTransaction("WITHDRAWAL", amount);
        }
    }

    @Override
    public void applyMonthlyFees() {
        // Checking account has a monthly fee
        double fee = 12.50;
        balance -= fee;
        logTransaction("MONTHLY FEE", fee);
    }

    public void displayBalanceAccount(){
        System.out.println("Account number : "+getAccountNumber()+" have balance : "+getBalance());
    }
}

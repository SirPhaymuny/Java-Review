package OOP.AbsractAndInterfaceUsage;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber("888809");
        checkingAccount.setAccountHolderName("Phaymuny");
        checkingAccount.deposit(90);
        checkingAccount.displayBalanceAccount();
        checkingAccount.deposit(10);
        checkingAccount.displayBalanceAccount();
    }
}

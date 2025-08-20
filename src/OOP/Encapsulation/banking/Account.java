package OOP.Encapsulation.banking;


public class Account {
    private Integer account;
    private Integer balance;


    public Account(){}

    public Account(Integer account, Integer balance) {
        this.account = account;
        this.balance = balance;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer account, Integer amount){
        System.out.println("deposit to account "+account+" with amount "+amount);
    }


}

package OOP.Inheritance;

public class PayPalPayment extends Payment{

    private String email;
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    @Override
    public void pay() {
        System.out.println("Paying $" + amount + " using PayPal account: " + email);
    }
}

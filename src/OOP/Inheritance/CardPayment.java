package OOP.Inheritance;

public class CardPayment extends Payment{
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Paying $" + amount + " using Credit Card: " + cardNumber);
    }
}

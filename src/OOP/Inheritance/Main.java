package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CardPayment(150.00, "1234-5678-9876-5432");
        Payment payment2 = new PayPalPayment(75.50, "user@example.com");

        // Polymorphism: same method name, different behavior
        payment1.pay();
        payment2.pay();
    }
}

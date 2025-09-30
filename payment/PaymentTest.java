
abstract class Payment {
    public abstract void validatePayment(); 
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void validatePayment() {
        System.out.println("Validating Credit Card Payment...");
    }
}

class DebitCardPayment extends Payment {
    @Override
    public void validatePayment() {
        System.out.println("Validating Debit Card Payment...");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void validatePayment() {
        System.out.println("Validating Net Banking Payment...");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new DebitCardPayment();
        Payment p3 = new NetBankingPayment();

        p1.validatePayment();
        p1.processPayment();

        p2.validatePayment();
        p2.processPayment();

        p3.validatePayment();
        p3.processPayment();
    }
}

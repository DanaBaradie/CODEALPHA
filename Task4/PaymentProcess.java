package Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentProcess {
    private double amount;
    private String cardNumber;
    private String CVV;

    public PaymentProcess(double amount, String cardNumber, String CVV){
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
    }
    public double getAmount() {
        return amount;
    }
    public String getCVV() {
        return CVV;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public boolean validateCardNumber(String cardNumber){
        Pattern CardPattern = Pattern.compile("^\\d{13,17}$");
        Matcher matcher = CardPattern.matcher(cardNumber);
        return matcher.matches();
    }
    public boolean validateCVV(String CVV){
        Pattern CVVPattern = Pattern.compile("^\\d{3,4}$");
        Matcher matcher = CVVPattern.matcher(CVV);
        return matcher.matches();
    }
}
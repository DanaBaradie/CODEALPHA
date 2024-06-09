package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankScanner {
    private String accountNumber;
    private String name;
    private double balance;

    public BankScanner(String accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("The amount should be greater than zero.");
        }else{
            balance += amount;
            System.out.println("Deposit is added successfully, your current balance is " + this.balance);
        }
    }
    public void withdraw(double amount){
        if(amount > balance || amount < 0){
            System.out.println("Insufficient funds.");
        }else{
            balance -= amount;
            System.out.println(amount + " is successfully withdrawn from your account, you current balance is " + this.balance);
        }
    }
    public boolean validateAccountNum(String accNum){
        Pattern AccountNum = Pattern.compile("^\\d{8,17}$");
        Matcher matcher = AccountNum.matcher(accNum);
        return matcher.matches();
    }
}
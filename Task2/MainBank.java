package Task2;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("Enter your Account number: ");
        String accNum = inn.nextLine();
        System.out.print("Enter your name: ");
        String name = inn.nextLine();
        System.out.print("Enter your current balance: ");
        double balance = inn.nextDouble();

        BankScanner bankScanner = new BankScanner(accNum, name, balance);

        bankScanner.validateAccountNum(accNum);

        while(true){
            System.out.println("Welcome to your Bank account: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option from above: ");
            int choice = inn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount in ordert to deposit: ");
                    double depoAmount = inn.nextDouble();
                    bankScanner.deposit(depoAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw: ");
                    double withAmount = inn.nextDouble();
                    bankScanner.withdraw(withAmount);
                    break;
                case 3:
                    System.out.println("Your current balance: " + bankScanner.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you.");
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid choice. Please take care to available choices.");
                    break;
            }

        }  
    }
}
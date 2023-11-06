/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/



//main method

//create Scanner object
import java.util.Scanner;

class BankAccount {
    private long accountNumber;
    private double accountBalance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter BankAccount Number: ");
        long accountNumber = scanner.nextLong();
        bankAccount.setAccountNumber(accountNumber);

        System.out.print("Enter Current Balance: ");
        double accountBalance = scanner.nextDouble();
        bankAccount.setAccountBalance(accountBalance);

        System.out.println("BankAccount Number: " + bankAccount.getAccountNumber());
        System.out.println("Current Balance: " + bankAccount.getAccountBalance());

        scanner.close();
    }
}

//Take input from user

//Create an object of BankAccount class and set account_number and the account_balance

// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 

// Print account_number and account_balance 

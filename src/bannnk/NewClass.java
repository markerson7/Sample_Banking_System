/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bannnk;

/**
 *
 * @author marke
 */


  

class Account {
    private String Bankname;
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double loanAmount;

    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.loanAmount = 0.0;
        Bankname = "ECO Bank";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Bank Name: $" + Bankname);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Loan Amount: $" + loanAmount);
       
        
    }

    public void giveLoan(double amount) {
        if (amount > 0) {
            loanAmount += amount;
            System.out.println("Loan Provided: $" + amount);
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    public void loanPayment(double amount) {
        if (amount > 0 && amount <= balance) {
            double interest = amount * 0.03;
            balance -= amount;
            loanAmount -= (amount + interest);
            System.out.println("Loan Payment: $" + amount);
            System.out.println("Interest Paid: $" + interest);
        } else {
            System.out.println("Invalid loan payment.");
        }
    }
}

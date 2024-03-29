/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bannnk;

import java.util.Scanner;

/**
 *
 * @author marke
 */



public class Bannnk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Account Password: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Please Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

       Account account = new Account(accountNumber, accountHolderName);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Account Information");
            System.out.println("4. Give Loan");
            System.out.println("5. Loan Payment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Plese enter the amount you want to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Please enter the amount you want to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayAccountInfo();
                    break;
                case 4:
                    System.out.print("Please enter the loan amount you want: $");
                    double loanAmount = scanner.nextDouble();
                    account.giveLoan(loan amount);
                    break;
                case 5:
                    System.out.print("Please enter loan payment amount: $");
                    double loanPaymentAmount = scanner.nextDouble();
                    account.loanPayment(loanPaymentAmount);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }}

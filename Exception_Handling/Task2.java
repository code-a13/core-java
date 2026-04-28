package Exception_Handling;

import java.util.Scanner;
import java.util.InputMismatchException;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Task2 {

    static void withdraw(int balance, int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds. Your current balance is Rs. " + balance);
        }
        System.out.println("Transaction successful! Please collect Rs. " + amount);
        System.out.println("Remaining balance: Rs. " + (balance - amount));
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your current balance: Rs. ");
            int myBalance = sc.nextInt();

            System.out.print("Enter withdrawal amount: Rs. ");
            int withdrawalAmount = sc.nextInt();

            System.out.println("Initiating withdrawal of Rs. " + withdrawalAmount + "...");
            withdraw(myBalance, withdrawalAmount);
            
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Transaction Failed: Invalid input. Please enter numbers only.");
        } catch (Exception e) {
            System.out.println("Transaction Failed: An unexpected error occurred.");
        } finally {
            System.out.println("Thank you for using our ATM.");
        }
    }
}
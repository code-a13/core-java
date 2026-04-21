package Encapsulation;
import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Wallet Id: ");
        String wallet = sc.nextLine();
        TravelWallet tc = new TravelWallet(wallet);
        System.out.println("Wallet Id: "+tc.getWalletId());
        System.out.println("Balance is: "+tc.getBalance());
        System.out.println("Add Money");
        tc.addMoney(500);
        tc.deductFare(300);
        tc.deductFare(300);
        sc.close();
        
    }
}
class TravelWallet{
    private String walletId;
    private double balance;
    TravelWallet(String walletId){
        this.walletId = walletId;
        balance = 0.0;
    }
    public String getWalletId() {
        return walletId;
    }
    public double getBalance() {
        return balance;
    }
    public void addMoney(double amount){
        if(amount>0){
        balance += amount;
        System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("It must be greater than Zero");
        }
    }
    public void deductFare(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Funds !");
            System.out.println("Balance: "+balance);
        }
    }
}
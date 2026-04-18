package Class_Object;
public class Task2{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aditya", 0.00);
        account1.deposit(5000.00);
        account1.withdraw(6000.00);
        account1.withdraw(2000.00); 

    }
}
class BankAccount{
    
    String accountHolder;
    double balance;

    BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current Balance: " + balance); 
        }
    }
}
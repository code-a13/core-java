package Inheritance;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base price of the product:");
        double basePrice = sc.nextDouble();
        Electronics child = new Electronics();
        double finalPrice = child.calculatePrice(basePrice);
        System.out.println("Final price of the product: "+finalPrice);
        sc.close();
    }
}
class Product{
    double calculatePrice(double baseprice){
        return baseprice;
    }
}
class Electronics extends Product{
    @Override
    double calculatePrice(double baseprice) {
        return baseprice + (baseprice * 0.18);
    }
}

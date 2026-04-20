package Encapsulation;

public class Task1 {
    public static void main(String[] args) {
       
        Product p1 = new Product("Wireless Mouse", 1000.0);
        System.out.println("Product Created: " + p1.getProductName());

        p1.setPrice(1500.0);
        System.out.println("Price updated successfully.");

        System.out.println("\n--- Testing Invalid Price ---");
        p1.setPrice(-500.0); 

        System.out.println("\n--- Testing Valid Discount ---");
        p1.setDiscountPercentage(20.0); 
        System.out.println("Final Price after 20% discount: " + p1.getFinalPrice()); 

        System.out.println("\n--- Testing Invalid Discount ---");
        p1.setDiscountPercentage(150.0); 
    }
}

class Product {
    private String productName;
    private double price;
    private double discountPercentage;

    public Product(String productName, double price) {
        this.productName = productName;
        if(price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
            System.out.println("Invalid initial price. Set to 0.0");
        }
    }

    public String getProductName() {
        return productName;
    }

    
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price: Cannot be negative or zero!");
        }
    }

    public void setDiscountPercentage(double discount) {
        if(discount >= 0 && discount <= 100) {
            this.discountPercentage = discount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid Discount: Must be between 0 and 100!");
        }
    }

    public double getFinalPrice() {
        double discountAmount = price * (discountPercentage / 100);
        return price - discountAmount;
    }
}
package Class_Object;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Product p1 = new Product(1,"PEN",10,10);
        Product p2 = new Product(2,"PENCIL",5,10);
        Cart cart = new Cart();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID to buy");
        int id = sc.nextInt();
        System.out.println("Enter quantity to buy");
        int quantity = sc.nextInt();
        if(id == p1.id){
            cart.addProduct(p1, quantity);
        }
        else if(id == p2.id){
            cart.addProduct(p2, quantity);
        }
        else{
            System.out.println("Invalid Product ID");
        }
        cart.cartDetails();
        System.out.println("Stock remaining "+p1.stockQuantity);
        System.out.println("Stock remaning "+p2.stockQuantity);
        sc.close();
    }
    
}
class Product{
    int id ;
    String name;
    double price;
    int stockQuantity;
    Product(int id , String name,double price,int Stocks){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = Stocks;
    }
}
class Cart{
    double totalAmount = 0;
     void addProduct(Product p,int quantity){
        if( quantity > 0 && quantity <= p.stockQuantity){
            p.stockQuantity -= quantity; 
            totalAmount += quantity*p.price;
            System.out.println("Added to Cart !");
        }
        else{
            System.out.println("Out of Stock for "+p.name +"Stock: "+p.stockQuantity);
        }
    }
    void cartDetails(){
        System.out.println("Total Amount: "+totalAmount);
        
    }
}
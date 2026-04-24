package Polymorphism;

public class Task4 {
    public static void main(String[] args) {
        HouseRobot hr = new HouseRobot();
        hr.cleanFloor();
        hr.cookFood();
    }
}
interface Chef{
    void cookFood();
}
interface Cleaner{
    void cleanFloor();
}
class HouseRobot implements Chef,Cleaner{
    
    @Override
    public void cookFood(){
        System.out.println("Cooking Pasta...");
    }
    @Override
    public void cleanFloor(){
        System.out.println("Cleaning the living room...");
    }
}
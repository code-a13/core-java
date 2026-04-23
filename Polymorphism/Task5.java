package Polymorphism;

public class Task5 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
interface Shape{
    void draw();
}
class Circle implements Shape{
    
    //Raises an error if the method is not properly overridden

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
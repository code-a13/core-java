package Inheritance;

public class Task4 {
    public static void main(String[] args) {
        User u1 = new Admin();
        u1.getAccess();
        System.out.println(u1.role);
    }
}
class User {
    String role = "Basic";
    void getAccess(){
        System.out.println("Access Restricted");
    }
}
class Admin extends User{
    String role = "SuperUser";
    @Override
    void getAccess(){
        System.out.println("Access Granted");
    }
}
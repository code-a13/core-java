package Class_Object;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Driver d = new Driver("ARUN", true, 0);
        RideApp app = new RideApp();
        System.out.println("Welcome to Kupido");
        System.out.println("Enter Pickup Location(0-100): ");
        int userpickup = sc.nextInt();
        System.out.println("Enter Drop Location(1-100):");
        int userdrop = sc.nextInt();
        Rider currentRider = new Rider(userpickup, userdrop);
        app.bookcab(currentRider, d);
        app.driverdetails(d);
        sc.close();
    }
}
class Driver{
    String name;
    boolean isAvailable;
    int currentLocation;
    Driver(String name,boolean isAvailable,int currentLocation){
        this.name=name;
        this.isAvailable=isAvailable;
        this.currentLocation=currentLocation;
    }

}
class Rider{
    int PickupLocation;
    int DropLocation;
    Rider(int PickupLocation,int DropLocation){
        this.PickupLocation=PickupLocation;
        this.DropLocation=DropLocation;
    }
}
class RideApp{
    int fare = 0;
    void bookcab(Rider r,Driver d){
        if(d.isAvailable){
            int distance = Math.abs(r.DropLocation - r.PickupLocation);
            fare = distance * 15;
            d.isAvailable = false;
            d.currentLocation = r.DropLocation;
            System.out.println("FARE: "+fare);
        }
    }
    void driverdetails(Driver d){
        System.out.println("Name: " + d.name);
        System.out.println("Available: " + d.isAvailable);
        System.out.println("Current Location: " + d.currentLocation);
    }
}
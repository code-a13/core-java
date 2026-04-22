package Inheritance;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hospital name:");
        String hosp = sc.nextLine();
        Surgeon child = new Surgeon(hosp);
        sc.close();
    }

}
class Doctor{
    String hospitalName;
    Doctor(String hospitalName){
        this.hospitalName = hospitalName;
        System.out.println("Parent: Doctor Working in "+hospitalName);
    }
}
class Surgeon extends Doctor{

    Surgeon(String hospitalName) {
        super(hospitalName);
        System.out.println("Child: Surgeon Working in "+hospitalName);
    }
    
} 
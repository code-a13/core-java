package Polymorphism;

public class Task2 {
    public static void main(String[] args) {
        Device[] mydevices = {new TV(),new AC()};
        for(int i = 0;i<mydevices.length;i++){
            mydevices[i].powerOn();
        }
    }
}
class Device{
    public void powerOn(){
        
        System.out.println("1. Connecting to power supply...");
    }
}
class TV extends Device{
    public void powerOn(){
        super.powerOn();
        System.out.println("2. TV Display ON");
    }
}

class AC extends Device{
    public void powerOn(){
        super.powerOn();
        System.out.println("2. AC Cooling Started");
    }
}
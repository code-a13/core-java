package Encapsulation;
import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ServerConfig SC = new ServerConfig();
        System.out.println("Changing Port Number :");
        int port = sc.nextInt();
        SC.changePort(port);
        SC.startServer();
        SC.changePort(port);
        SC.stopServer();
        SC.changePort(port);
        sc.close();
    }
}
class ServerConfig{
    private int portNumber;
    private boolean isServerRunning;
    ServerConfig(){
        this.portNumber = 8080;
        isServerRunning = false;
    }
    public void startServer(){
        isServerRunning = true;
        System.out.println("Server Started !");
    }
    public void stopServer(){
        isServerRunning = false;
        System.out.println("Server Stopped !");
    }
    public void changePort(int newport){
        if(isServerRunning==false){
            portNumber = newport;
            System.out.println("Port Changed to "+portNumber);
        }
        else{
            System.out.println("Acess Denied !");
        }
    }
}
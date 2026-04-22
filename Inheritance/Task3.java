package Inheritance;

public class Task3 {
    public static void main(String[] args) {
        TCPPacket tcp = new TCPPacket();
        tcp.send();
    }
}
class NetworkPacket{
    void send(){
        System.out.println("Adding IP Headers...");
    }
}
class TCPPacket extends NetworkPacket{
    @Override
    void send(){
        super.send();
        System.out.println("Adding TCP Headers...");
    }
}
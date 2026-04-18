package Class_Object;

public class Task3 {
    public static void main(String[] args) {

        Player p1 = new Player("Sub-Zero");
        Player p2 = new Player("Scorpion");

        p1.attack(p2);
        p1.attack(p2);
        p2.attack(p1);
        System.out.println(p1.name + " Health: " + p1.health);
        System.out.println(p2.name + " Health: " + p2.health);
    }
}

class Player {
    String name;
    int health = 100;

    Player(String name) {
        this.name = name;
    }

    void attack(Player enemy) {
        enemy.health -= 20;
        System.out.println(this.name + " attacked " + enemy.name + " (-20 HP)");
    }
}
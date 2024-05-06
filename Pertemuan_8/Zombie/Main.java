import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listItem = new ArrayList<String>(){{
            add("SWORD");
            add("SHIELD");
            add("POTION");
        }};
        Player P1 = new Player(10, 50, "Wahhab");
        Merchant merchant1 = new Merchant(20, 20, listItem);
        Zombie zombie1 = new Zombie(5, 30, Zombie.TYPE.MEELE);
        Zombie zombie2 = new Zombie(5, 15, Zombie.TYPE.RANGED);

        System.out.println("TEST INFO OBJEK");
        P1.displayInfo();
        merchant1.displayInfo();
        zombie1.displayInfo();
        zombie2.displayInfo();
        System.out.println("----------------\n");
        
        System.out.println("");
        
        System.out.println("TEST INTERAKSI MERCHANT");
        P1.interact(merchant1);
        P1.attack(merchant1);
        P1.attack(merchant1);
        P1.interact(merchant1);
        System.out.println("----------------\n");

        System.out.println("TEST SERANG ZOMBIE\n");
        P1.attack(zombie1);
        P1.attack(zombie1);
        P1.attack(zombie1);
        zombie1.attack(P1);
        System.out.println("----------------\n");
        
        System.out.println("TEST SERANG PLAYER\n");
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        P1.interact(merchant1);
        P1.attack(zombie1);

    }
}

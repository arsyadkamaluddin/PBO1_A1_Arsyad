public class Main{
    public static void main(String[] args) {
        Sword pedang = new Sword("Azkab", "Mid", 1000, 100);
        Potion damPot = new Potion("Deadnuff", "High", 100, 10, 200, "attack");
        Potion healPot = new Potion("PhysAid", "Low", 2000, 20, 100, "heal");
        Shield tameng = new Shield("NuShield", "Mid", 100, 2000);

        pedang.info();
        pedang.attack();
        damPot.info();
        damPot.use();
        healPot.info();
        healPot.use();
        tameng.info();
        tameng.defense();
    }
}
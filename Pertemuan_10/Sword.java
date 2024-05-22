public class Sword extends Item{
    private int damage;

    public Sword(String nama, String nrank, int price, int damage) {
        super(nama, nrank, price);
        this.damage = damage;
    }
    public void attack(){
        super.attack(damage);
    }
}

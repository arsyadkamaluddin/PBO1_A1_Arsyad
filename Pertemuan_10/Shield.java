public class Shield extends Item{
    private int damage_block;

    public Shield(String nama, String nrank, int price, int damage_block) {
        super(nama, nrank, price);
        this.damage_block = damage_block;
    }
    public void defense(){
        System.out.println("Damage mitigated by "+damage_block);
    }
}

public class Potion extends Item{
    private int duration;
    private int effectPoint;
    private String potType;
    public Potion(String nama, String nrank, int price, int duration, int effectPoint, String potType) {
        super(nama, nrank, price);
        this.duration = duration;
        this.effectPoint = effectPoint;
        this.potType = potType;
    }
    public void use(){
        if(potType=="attack"){
            super.attack(effectPoint);
        }else{
            System.out.println("Healed by "+effectPoint);
        }
    }

}

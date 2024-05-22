abstract class Item {
    private String nama;
    private String nrank;
    private int price;
    
    protected Item(String nama, String nrank, int price) {
        this.nama = nama;
        this.nrank = nrank;
        this.price = price;
    }
    public void info(){
        System.out.printf("\nNama : %s\nRank : %s\nPrice : %d\n",nama,nrank,price);
    }
    protected void attack(int damage){
        System.out.println("Damage dealt by "+damage);
    }
}

public class Player extends Entity {
    private String nama;
    public Player(int level,int hp, String nama){
        super(level,hp);
        this.nama = nama;
    } 
    public void displayInfo(){
        System.out.printf("# PLAYER DENGAN NAMA : %s, DAN LEVEL : %d\n",this.nama,getLevel());
    }
    public void interact(Merchant merchant){
        if(getHp()>0){
            if(merchant.getHp()>0){
                System.out.println("Merchant : "+merchant.response());
            }
            System.out.println("");
            if(merchant.getHp()<=0){
                System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
            }
        }else{
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
}

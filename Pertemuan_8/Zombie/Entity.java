public class Entity {
    private int hp;
    private int level;
    protected Entity(int level,int hp){
        this.hp = hp;
        this.level = level;
    }
    protected int getHp(){
        return hp;
    }
    protected int getLevel(){
        return level;
    }
    protected void inHp(int hp){
        this.hp -= hp;
    }
    public void attack(Zombie zombie){
        if(getHp()>0){
            if(zombie.getHp()>0){
                zombie.inHp(10);
                System.out.println("Zombie : GRAAA!");
                if(zombie.getHp()<=0)System.out.println("# ZOMBIE MATI");
                return;
            }
            System.out.println("# ZOMBIE MATI");
        }else{
            System.out.println("# PLAYER SUDAH MATI");
        }

    }
    
    public void attack(Merchant merchant){
        if(getHp()>10){
            if(merchant.getHp()>0){
                merchant.inHp(10);
                System.out.println("Merchant : hey, ngapain nyerang");
                if (merchant.getHp()>0)return;
            }
            System.out.println("Merchant : dahlah, males jualan");
        }else{
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
}

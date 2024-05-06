public class Zombie extends Entity{
    public enum TYPE{
        MEELE, RANGED
    }
    private TYPE zombieType;
    public Zombie(int level,int hp,TYPE zombieType){
        super(level,hp);
        this.zombieType = zombieType;
    }
    public void displayInfo(){
        System.out.printf("# ZOMBIE DENGAN TYPE : %s, DAN LEVEL : %d\n",getType().name(),getLevel());
    }
    private TYPE getType(){
        return zombieType;
    }
    public void attack(Player player){
        if(getHp()>0){
            if(player.getHp()>0){
                player.inHp((zombieType==TYPE.MEELE)?20:15);
                System.out.println("Player : UGGHH");
            }
            if(player.getHp()<=0)System.out.println("# YOU DIE, GAME OVER");
        }else{
            System.out.println("# ZOMBIE SUDAH MATI");
        }
    }
}

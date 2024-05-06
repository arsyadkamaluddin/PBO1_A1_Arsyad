import java.util.ArrayList;
public class Merchant extends Entity {
    private ArrayList<String> listItem;
    public Merchant(int level,int hp, ArrayList listItem){
        super(level,hp);
        this.listItem = listItem;
    }
    public void displayInfo(){
        System.out.printf("# MERCHANT DENGAN LEVEL : %d\n",getLevel());
    }
    public String response(){
        String response = "";
        if(getHp()>0){
            response += "\nBarang yang tersedia hari ini";
            for(String item : listItem){
                response +="\n# "+item;
            }
        }else{
            response += "";
        }
        return response;
    }
}

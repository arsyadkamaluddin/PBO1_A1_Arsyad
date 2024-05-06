package Mobil;

public class Truck extends Vehicle{
    private int cargo;

    public Truck(String brand,int year, int price,int cargo){
        super(brand, year, price);
        this.cargo = cargo;
    }
    public void displayInfo(){
        System.out.printf("Detail Truck :\nMerk : %s\nTahun : %d\nHarga Sewa : %d\nKapasitas Cargo : %d\nTotal Diskon :%d\nHarga Sewa setelah diskon : %d\n---------------------------------\n",getBrand(),getYear(),getPrice(),getCargo(),getDiscount(),calcPrice());
    }
    private int calcPrice(){
        return getPrice()-getDiscount();
    }
    private int getCargo(){
        return cargo;
    }
    private int getDiscount(){
        int disc = getYear()<2010?10:0;
        if(cargo>2000)disc += 10;
        return getPrice()*disc/100;
    }
}

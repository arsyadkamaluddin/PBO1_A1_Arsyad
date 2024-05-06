package Mobil;

public class Car extends Vehicle{
    public static enum TYPE{
        CITY,PREMIUM,FAMILY
    }
    Car.TYPE CarType;
    public Car(String brand,int year, int price,Car.TYPE CarType){
        super(brand,year,price);
        this.CarType = CarType;
    }
    public void displayInfo(){
        System.out.printf("Detail Mobil :\nMerk : %s\nTahun : %d\nHarga Sewa : %d\nTipe Mobil : %s\nTotal Diskon :%d\nHarga Sewa setelah diskon : %d\n---------------------------------\n",getBrand(),getYear(),getPrice(),getType(),getDiscount(),calcPrice());
    }
    private int calcPrice(){
        return getPrice()-getDiscount();
    }
    private String getType(){
        return CarType.name();
    }
    private int getDiscount(){
        int disc = getYear()<2010?10:0;
        switch (CarType) {
            case FAMILY:
                disc += 5;
                break;
            case PREMIUM:
                disc += 10;
                break;
            default:
                disc += 0;
                break;
        }
        return getPrice()*disc/100;
    }
}
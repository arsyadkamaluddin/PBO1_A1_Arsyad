package Mobil;

public class Vehicle {
    private int price;
    private int year;
    private String brand;

    public Vehicle(String brand,int year, int price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    protected int getPrice(){
        return price;
    }
    protected int getYear(){
        return year;
    }
    protected String getBrand(){
        return brand;
    }
}

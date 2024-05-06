package Mobil;
public class Main {
    public static void main(String[] args) {
        Car innova = new Car("Innova Reborn", 2015, 500, Car.TYPE.PREMIUM);
        Car avanza = new Car("Avanza", 2009, 300, Car.TYPE.FAMILY);
        Car brio = new Car("Honda Brio", 2012, 300, Car.TYPE.CITY);
        
        innova.displayInfo();
        avanza.displayInfo();
        brio.displayInfo();
        
        Truck isuzuTruck = new Truck("Isuzu", 2013 ,500 , 1500);
        Truck volvoTruck = new Truck("Volvo", 2013, 650,2500);
        Truck hinoTruck = new Truck("Hino", 2005, 800,4000);
        Truck misubishiTruck = new Truck("Mitsubishi", 2010, 850,4000);

        isuzuTruck.displayInfo();
        volvoTruck.displayInfo();
        hinoTruck.displayInfo();
        misubishiTruck.displayInfo();
    }
}

public class Trip {
    private String destination;
    private int price;
    private String departure;
    private TravelAgent.TripType jenisTrip;
    private int qty;

    public Trip(String destination,int price,String departure,TravelAgent.TripType jenisTrip,int qty){
        this.destination = destination;
        this.price = price;
        this.departure = departure;
        this.jenisTrip = jenisTrip;
        this.qty = qty;
    }

    public String getDestination(){
        return destination;
    }
    public String getDeparture(){
        return departure;
    }
    public int getPrice(){
        return price;
    }
    public TravelAgent.TripType getType(){
        return jenisTrip;
    }
    public int getQty(){
        return qty;
    }
    public void increaseQty(){
        qty += 1;
    }
    public void decreaseQty(){
        qty -= 1;
    }
}

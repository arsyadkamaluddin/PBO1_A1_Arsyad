public class Book {
    private String idBooking;
    private Customer customer;
    private Trip trip;

    public Book(String idBooking,Customer customer,Trip trip){
        this.idBooking = idBooking;
        this.customer = customer;
        this.trip = trip;
    }
    public String getId(){
        return idBooking;
    }
    public String getEmail(){
        return customer.getEmail();
    }
    public String getTrip(){
        return trip.getDestination();
    }
}

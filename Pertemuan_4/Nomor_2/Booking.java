public class Booking {
    Movie film;
    String idBooking;
    int seats;
    Booking(Movie mov,int seats, String id){
        this.film = mov;
        this.idBooking=id;
        this.seats=seats;
    }
}

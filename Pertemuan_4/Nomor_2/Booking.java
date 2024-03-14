public class Booking {
    Movie film;
    int ticket;
    String id;
    Booking(Movie film,int seats,String id){
        this.film = film;
        this.ticket=seats;
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        MovieApp app = new MovieApp();
        Movie film1 = new Movie("Sherlock",1,20);
        Movie film2 = new Movie("Holmes",2,12);
        app.addMovie(film1);
        Booking pertama = new Booking(film1,app.generateId());
        app.addBooking(pertama);

        app.displayBooking();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieApp app = new MovieApp();
        Movie avenger = new Movie("Avenger","Action",180,45);
        Movie dune = new Movie("Dune","Action",180,45);
        app.addMovie(avenger);
        app.addMovie(dune);
        app.displayMovie();
        app.searchMovie("Avenger");
        app.searchMovie("Dune");
        app.searchMovie("AvengerDune");
        app.bookMovie(avenger,20);
        app.bookMovie(dune,50);
        app.displayMovie();
        app.displayBooking();
        System.out.printf("Masukkan ID Booking");
        Scanner scan = new Scanner(System.in);
        String idBook = scan.nextLine();
        app.searchBooking(idBook);

    }
}

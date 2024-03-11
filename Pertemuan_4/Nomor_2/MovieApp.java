import java.util.ArrayList;

public class MovieApp {
    ArrayList<Movie> daftarFilm;
    ArrayList<Booking> daftarBooking;
    MovieApp(){
        daftarFilm = new ArrayList<Movie>();
        daftarBooking = new ArrayList<Booking>();
    }

    void addMovie(Movie movie){
        daftarFilm.add(movie);
    }
    void addBooking(Booking book){
        daftarBooking.add(book);
    }
    void displayMovie(){
        System.out.println("==== Daftar Film ====");
        for(Movie e:daftarFilm){
            System.out.printf("(%s) %s",e.durasi(),e.movieTitle);
        }
    }

    boolean checkAvail(Booking movSearch){
        
    }
    
    String generateId(){
        return String.format("MOV00%d",daftarBooking.size()+1);
    }
    
    void displayBooking(){
        System.out.println("==== Daftar Booking ====");
        for(Booking e:daftarBooking){
            System.out.printf("(%s) - %s : %s",e.film.durasi(),e.idBooking,e.film.movieTitle);
        } 
    }
}

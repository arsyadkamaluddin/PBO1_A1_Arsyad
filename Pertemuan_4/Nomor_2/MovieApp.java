import java.util.ArrayList;
import java.util.Random;

public class MovieApp {
    ArrayList<Movie> daftarFilm = new ArrayList<Movie>();
    ArrayList<Booking> daftarBooking = new ArrayList<Booking>();

    MovieApp(){
        
    }
    void addMovie(Movie film){
        daftarFilm.add(film);
    }
    void displayMovie(){
        System.out.println("Daftar Film");
        for(Movie e:daftarFilm){
            System.out.printf("%d mins ~ %s - %s (%d Seats)\n",e.duration,e.movieTitle,e.genre,e.availableSeats);
        }
    }
    void searchMovie(String title){
        for(Movie e:daftarFilm){
            if(e.movieTitle==title){
                System.out.printf("Film %s tersedia %d kursi\n",e.movieTitle,e.availableSeats);
                return;
            }
        }
        System.out.printf("Film %s tidak tersedia\n",title);
    }
    void bookMovie(Movie film,int seats){
        for(Movie e:daftarFilm){
            if(e.movieTitle==film.movieTitle){
                if(e.availableSeats>=seats){
                    e.availableSeats -= seats;
                    Booking baru = new Booking(film,seats,generateId());
                    daftarBooking.add(baru);
                    System.out.println("\nPesanan berhasil dengan detail");
                    System.out.printf("Judul : %s\n",baru.film.movieTitle);
                    System.out.printf("Jumlah : %d\n",baru.ticket);
                    System.out.printf("Booking ID : %s\n",baru.id);
                    return;
                }
            }
        }
        System.out.printf("\nPesanan %s gagal\n\n",film.movieTitle);
    }
    String generateId(){
        // return String.format("00%d",daftarBooking.size()+1);
        // return daftarBooking.size()+1;
        Random rand = new Random();
        return String.format("MOV%d\n",rand.nextInt(999-100+1)+100);
        // return rand.nextInt(999-100+1)+100;
    }
    void displayBooking(){
        for(Booking e:daftarBooking){
                System.out.printf("Pesanan %s\n",e.id);
                System.out.printf("Film %s\n",e.film.movieTitle);
                System.out.printf("Jumlah %d kursi\n",e.ticket);
        }

    }
    void searchBooking(String idBook){
        for(Booking e:daftarBooking){
            if(e.id==idBook.trim()){
                System.out.printf("\nPesanan %s\n",e.id);
                System.out.printf("Film : %s\n",e.film.movieTitle);
                System.out.printf("Jumlah : %d kursi\n",e.ticket);
                return;
            }
        }
        System.out.printf("\nPesanan %s tidak ditemukan\n",idBook);
    }
}

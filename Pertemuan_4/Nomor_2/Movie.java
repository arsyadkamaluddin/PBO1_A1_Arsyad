import java.util.ArrayList;

public class Movie {
    String movieTitle;
    String genre;
    int jam;
    int menit;
    int available;
    Movie(String title,String genre,int jam,int menit,int available){
        this.jam=jam;
        this.menit=menit;
        this.movieTitle = title;
        this.genre = genre;
        this.available=available;
    }
    String durasi(){
        return String.format("%d Jam %d Menit",jam,menit);
    }
}

public class Movie {
    String movieTitle;
    int availableSeats;
    String genre;
    int duration;

    Movie(String title,String genre,int duration,int seats){
        this.movieTitle=title;
        this.availableSeats=seats;
        this.genre=genre;
        this.duration=duration;
    }
}

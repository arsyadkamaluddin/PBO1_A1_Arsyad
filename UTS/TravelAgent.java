import java.util.ArrayList;

public class TravelAgent {
    public enum TripType {
        HOTEL, FLIGHT, PACKAGE
    }

    private ArrayList<Trip> trips;
    private ArrayList<Book> books;

    public TravelAgent() {
        this.trips = new ArrayList<Trip>();
        this.books = new ArrayList<Book>();
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    private int countAvailable() {
        int count = 0;
        for (Trip trip : trips) {
            if (trip.getQty() > 0) {
                count++;
            }
        }
        return count;
    }
    
    public void showAvailableTrip() {
        System.out.println("Terdapat " + countAvailable() + " trip yang tersedia :");
        for (Trip trip : trips) {
            if (trip.getQty() > 0){
                System.out.println("Destinasi : " + trip.getDestination() + " -- Keberangkatan : " + trip.getDeparture()
                        + "-- Harga : " + trip.getPrice() + " -- Qty : " + trip.getQty() + " -- Jenis : "
                        + trip.getType());
            }
        }
    }

    public void bookTrip(Customer customer, Trip trip) {
        for (Trip tripData : trips) {
            if (tripData.getDestination() == trip.getDestination() && tripData.getQty() < 1) {
                System.out.println("Pemesanan gagal, perjalanan ke " + trip.getDestination() + " telah habis terjual");
                return;
            }
        }
        for (Book book : books) {
            if (book.getEmail() == customer.getEmail() && book.getTrip() == trip.getDestination()) {
                System.out.println("Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama dengan ID "
                        + book.getId());
                return;

            }
        }
        for (Trip tripData : trips) {
            if (tripData.getDestination() == trip.getDestination()) {
                tripData.decreaseQty();
            }
        }
        String idBooking = generateBookingID(trip);
        Book now = new Book(idBooking, customer, trip);
        books.add(now);
        System.out.println("Pesanan dengan ID Booking " + idBooking + " Berhasil ditambahkan");
    }

    private String generateBookingID(Trip trip) {
        return String.format("%s%s%d", trip.getDestination(), trip.getType().toString(), books.size() + 1);
    }

    public void cancelBooking(String email, Trip trip) {
        int ind = -1;
        int stat = 0;
        for (Book book : books) {
            ind += 1;
            if (book.getEmail() == email && book.getTrip() == trip.getDestination()) {
                stat = 1;
                break;
            }
        }
        if (ind != -1 && stat != 0) {
            System.out.println("Pesanan dengan ID " + books.get(ind).getId() + " berhasil dibatalkan");
            books.remove(ind);
            for (Trip tripData : trips) {
                if (tripData.getDestination() == trip.getDestination()) {
                    tripData.increaseQty();
                }
            }
            return;
        }
        System.out.println("Tidak ditemukan booking yang sesuai");
    }
    public void getBookingsByCustomerEmail(String email){
        Boolean exist = false;
        System.out.println("Pesanan dengan email "+email);
        for(Book book : books){
            if(book.getEmail()==email){
                exist = true;
                System.out.println("Booking ID : "+book.getId()+", Destinasi : "+book.getTrip());
            }
        }
        if(!exist)System.out.println("Tidak ada");
    }
    public void getAvailableTripsByType(TripType tripType){
        System.out.println("Ditemukan "+countAvailableType(tripType)+" trip untuk jenis"+tripType.toString());
        for(Trip trip:trips){
            if(trip.getType()==tripType){
                System.out.println("Destinasi : " + trip.getDestination() + " -- Keberangkatan : " + trip.getDeparture()
                        + "-- Harga : " + trip.getPrice() + " -- Qty : " + trip.getQty() + " -- Jenis : "
                        + trip.getType());
            }
        }
    }
    private int countAvailableType(TripType tripType) {
        int count = 0;
        for (Trip trip : trips) {
            if (trip.getType() == tripType) {
                count++;
            }
        }
        return count;
    }
    private int countAvailableDate(String tanggal) {
        int count = 0;
        for (Trip trip : trips) {
            if (trip.getDeparture() == tanggal) {
                count++;
            }
        }
        return count;
    }
    public void getAvailableTripsByDate(String tanggal){
        System.out.println("Ditemukan "+countAvailableDate(tanggal)+" trip untuk tanggal "+tanggal);
        for(Trip trip:trips){
            if(trip.getDeparture() == tanggal){
                System.out.println("Destinasi : " + trip.getDestination() + " -- Keberangkatan : " + trip.getDeparture()
                        + "-- Harga : " + trip.getPrice() + " -- Qty : " + trip.getQty() + " -- Jenis : "
                        + trip.getType());
            }
        }

    }
}

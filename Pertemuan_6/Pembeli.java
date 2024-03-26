public class Pembeli {
    private String nama;
    private Toko.Barang barang;
    private int jumlah;
    public Pembeli(String nama,Toko.Barang barang,int jumlah){
        this.nama = nama;
        this.barang = barang;
        this.jumlah = jumlah;
    }
    
    public String getNama() {
        return nama;
    }
    public Toko.Barang getBarang() {
        return barang;
    }
    public int getJumlah() {
        return jumlah;
    }
}

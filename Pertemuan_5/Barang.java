import java.util.ArrayList;

public class Barang {
    private String namaBarang;
    private int hargaBarang, jumlahBarang;

    public Barang(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public void setNamaBarang(String nama){
        this.namaBarang= nama;
    }
    public String getNamaBarang(){
        return this.namaBarang;
    }
    public void setHargaBarang(int harga){
        this.hargaBarang=harga;
    }
    public int getHargaBarang(){
        return this.hargaBarang;
    }
    public void setJumlahBarang(int jumlah){
        this.jumlahBarang=jumlah;
    }
    public int getJumlahBarang(){
        return this.jumlahBarang;
    }
}

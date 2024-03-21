public class Barang {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    public Barang(String nama, int harga, int jml) {
        this.namaBarang = nama;
        this.hargaBarang = harga;
        this.jumlahBarang = jml;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int totalHarga() {
        return hargaBarang * jumlahBarang;
    }
}

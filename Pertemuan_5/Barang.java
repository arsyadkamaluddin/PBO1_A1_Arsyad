public class Barang {
    String namaBarang;
    int hargaBarang;
    int jumlahBarang;

    Barang(String nama,int harga,int jml){
        this.namaBarang = nama;
        this.hargaBarang =harga;
        this.jumlahBarang=jml;
    }
    int totalHarga(){
        return hargaBarang*jumlahBarang;
    }
}

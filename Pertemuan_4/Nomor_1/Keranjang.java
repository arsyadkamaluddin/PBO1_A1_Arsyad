package Nomor_1;
import java.util.ArrayList;
public class Keranjang {
    ArrayList<Barang> daftarBarang;
    int totalBarang;
    int jumlahTotal;
    Keranjang(){
        daftarBarang= new ArrayList<Barang>();
        totalBarang = 0;
    }
    void tambahBarang(Barang barangBaru){
        if(totalBarang<5){
            daftarBarang.add(barangBaru);
            totalBarang += barangBaru.jumlahBarang;
            jumlahTotal += barangBaru.totalHarga();
            System.out.println("Berhasil memasukkan keranjang");
        }else{
            System.out.println("Gagal, keranjang penuh");
        }
    }
    void printHasil(){
        System.out.printf("Jumlah barang di keranjang saat ini : %d\n",totalBarang);
        System.out.println("Barang pada keranjang :");
        for(Barang e:daftarBarang){
            System.out.printf("# %s, jumlah : %d\n",e.namaBarang,e.jumlahBarang);
        }
        System.out.printf("Total harga yang dibayar : %d",jumlahTotal);
    }
}

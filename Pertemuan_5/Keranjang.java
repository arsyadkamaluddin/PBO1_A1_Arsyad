import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Barang> daftarBarang;
    private int totalBarang;
    private int jumlahTotal;

    public Keranjang() {
        daftarBarang = new ArrayList<Barang>();
        totalBarang = 0;
        jumlahTotal = 0;
    }

    public void tambahBarang(Barang barangBaru) {
        if (totalBarang < 5) {
            daftarBarang.add(barangBaru);
            totalBarang += barangBaru.getJumlahBarang();
            jumlahTotal += barangBaru.totalHarga();
            System.out.println("Berhasil memasukkan keranjang");
        } else {
            System.out.println("Gagal, keranjang penuh");
        }
    }

    public void printHasil() {
        System.out.printf("Jumlah barang di keranjang saat ini : %d\n", totalBarang);
        System.out.println("Barang pada keranjang :");
        for (Barang e : daftarBarang) {
            System.out.printf("# %s, jumlah : %d\n", e.getNamaBarang(), e.getJumlahBarang());
        }
        System.out.printf("Total harga yang dibayar : %d", jumlahTotal);
    }
}

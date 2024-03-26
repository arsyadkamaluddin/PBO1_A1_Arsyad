public class Main {
    public static void main(String[] args) {
        Toko mebel = new Toko();
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU,50);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.CAT,50);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT,50);
        mebel.getGudangBarang().buatBarang(Toko.Barang.KURSI,3);
        mebel.getGudangBarang().buatBarang(Toko.Barang.LEMARI,30);
        mebel.getGudangBarang().cekIsiGudang();
        mebel.getGudangBarang().cekStokBahan();
        Pembeli anwar = new Pembeli("Anwar",Toko.Barang.KURSI,2);
        Pembeli yusuf = new Pembeli("Yusuf",Toko.Barang.KURSI,2);
        mebel.tambahAntrian(anwar);
        mebel.tambahAntrian(yusuf);
        mebel.cekIsiAntrian();
        mebel.selesaikanAntrian();
        mebel.cekIsiAntrian();
        mebel.getGudangBarang().cekIsiGudang();
        mebel.selesaikanAntrian();
        mebel.cekIsiAntrian();
    }
}

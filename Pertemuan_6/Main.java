public class Main {
    public static void main(String[] args) {
        Toko mebel = new Toko();
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU,100);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.CAT,100);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT,100);
        mebel.getGudangBarang().cekStokBahan();
        mebel.getGudangBarang().buatBarang(Toko.Barang.KURSI,3);
        mebel.getGudangBarang().buatBarang(Toko.Barang.MEJA,2);
        mebel.getGudangBarang().buatBarang(Toko.Barang.LEMARI,10);
        mebel.getGudangBarang().cekIsiGudang();
        Pembeli anwar = new Pembeli("Anwar",Toko.Barang.KURSI,2);
        Pembeli yusuf = new Pembeli("Yusuf",Toko.Barang.KURSI,2);
        Pembeli budi = new Pembeli("Budi",Toko.Barang.KURSI,2);
        Pembeli joko = new Pembeli("Joko",Toko.Barang.KURSI,2);
        Pembeli adi = new Pembeli("Adi",Toko.Barang.KURSI,2);
        mebel.tambahAntrian(anwar);
        mebel.tambahAntrian(yusuf);
        mebel.tambahAntrian(budi);
        mebel.tambahAntrian(joko);
        mebel.tambahAntrian(adi);
        mebel.cekIsiAntrian();
        Pembeli ina = new Pembeli("Ina",Toko.Barang.KURSI,2);
        mebel.tambahAntrian(ina);
        mebel.selesaikanAntrian();
        mebel.cekIsiAntrian();
        mebel.getGudangBarang().cekIsiGudang();
        mebel.selesaikanAntrian();
        mebel.cekIsiAntrian();
    }
}

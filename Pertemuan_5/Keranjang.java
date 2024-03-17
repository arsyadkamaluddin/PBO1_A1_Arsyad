import java.util.ArrayList;

public class Keranjang {

    int jmlBarang = 0, totalBerat = 0;

    ArrayList<Barang> listBarang = new ArrayList<>();

    public Keranjang() {
    }

    void tambahBarang(Barang barang){
        if(jmlBarang+barang.jumlahBarang <= 5){
            listBarang.add(barang);
            jmlBarang +=barang.jumlahBarang;
            System.out.println("Berhasil memasukan ke kranjang");
        }else{
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }

    }
    int totalHarga(){
        int harga = 0;
        for ( Barang barang: listBarang
             ) {
         harga += barang.hargaBarang * barang.jumlahBarang;
        }
        return harga;
    }

    void printHasil() {
        System.out.println( "Jumlah Barang Di Keranjang Saat Ini : " + jmlBarang);
        System.out.println( "Barang Pada Keranjang: ");
        for(int i = 0; i<listBarang.size(); i++){
            System.out.println("# " + listBarang.get(i).namaBarang + ", jumlah : " + listBarang.get(i).jumlahBarang);
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + totalHarga());
    }


}

import java.util.ArrayList;
public class Toko {
    public enum Barang{
        MEJA,KURSI,LEMARI
    }
    private ArrayList<Pembeli> listPembeli = new ArrayList<Pembeli>();
    private static Gudang gudang = new Gudang();
    public Toko(){
    }
    public Gudang getGudangBarang(){
        return this.gudang;
    }
    public void tambahAntrian(Pembeli buyer){
        if(!antrianPenuh()){
            listPembeli.add(buyer);
            System.out.println("Antrian berhasil ditambahkan");
        }else{
            System.out.println("Antrian penuh");
        }
    }
    public void cekIsiAntrian(){
        System.out.println("\n====LIST ANTRIAN====");
        for(int i=1;i<=listPembeli.size();i++){
            System.out.println(i+". "+listPembeli.get(i-1).getNama()+" - "+listPembeli.get(i-1).getJumlah()+" "+listPembeli.get(i-1).getBarang());
        }
        System.out.println("\n");
    }
    public void selesaikanAntrian(){
        Pembeli now = listPembeli.get(0);
        if(gudang.cekIsiGudang(now.getBarang(), now.getJumlah())){
            gudang.keluarkanBarang(now.getBarang(),now.getJumlah());
            System.out.println("antrian terdepan selesai");
            listPembeli.remove(0);
        }else{
            System.out.println("Barang tidak tersedia");
            listPembeli.remove(0);
        }
    }
    private boolean antrianPenuh(){
        return listPembeli.size()>=5;
    }
}

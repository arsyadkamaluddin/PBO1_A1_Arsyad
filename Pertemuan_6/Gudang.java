import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;
public class Gudang {
    public enum Bahan{
        KAYU,CAT,BAUT
    }
    private EnumMap<Bahan,Integer> stokBahan = new EnumMap<>(Bahan.class);
    private EnumMap<Toko.Barang,Integer> isiGudang = new EnumMap<>(Toko.Barang.class);
    public Gudang(){
        stokBahan.put(Bahan.BAUT,0);
        stokBahan.put(Bahan.KAYU,0);
        stokBahan.put(Bahan.CAT,0);
        isiGudang.put(Toko.Barang.KURSI,0);
        isiGudang.put(Toko.Barang.MEJA,0);
        isiGudang.put(Toko.Barang.LEMARI,0);
    }
    public void tambahBahan(Bahan bahan,int jumlah){
        stokBahan.replace(bahan, stokBahan.get(bahan)+jumlah);
    }
    public void kurangiBahan(Bahan bahan,int jumlah){
        stokBahan.replace(bahan, stokBahan.get(bahan)-jumlah);
    }
    public void cekStokBahan(){
        System.out.println("\n===STOK BAHAN===");
        for(Map.Entry<Bahan,Integer> i: stokBahan.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
        System.out.println("\n");
    }
    public boolean cekIsiGudang(Toko.Barang barang,int jumlah){
        if(isiGudang.get(barang)>=jumlah){
            return true;
        }
        return false;
    }
    public void cekIsiGudang(){
        System.out.println("\n====ISI GUDANG====");
        for(Map.Entry<Toko.Barang,Integer> i: isiGudang.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
        System.out.println("\n");
    }
    public void buatBarang(Toko.Barang barang,int jumlah){
        if(bahanPembuatan(barang, jumlah)){
            System.out.println(jumlah+" "+barang+" berhasil ditambahkan ke gudang");
            masukanBarang(barang,jumlah);
        }else{
            System.out.println("Barang gagal dibuat atau ditambahkan");
        }
    }
    private void masukanBarang(Toko.Barang barang, int jumlah){
        isiGudang.replace(barang, isiGudang.get(barang)+jumlah);
    }
    public void keluarkanBarang(Toko.Barang barang, int jumlah){
        isiGudang.replace(barang, isiGudang.get(barang)-jumlah);
        System.out.println(jumlah+" "+barang.toString()+" berhasil dikeluarkan");
    }
    private boolean bahanPembuatan(Toko.Barang barang,int jumlah){  
        switch (barang) {
            case KURSI:
                if(slotTersedia(barang,jumlah) &&stokBahan.get(Bahan.BAUT)>=10*jumlah && stokBahan.get(Bahan.CAT)>=1*jumlah && stokBahan.get(Bahan.KAYU)>=2*jumlah){
                    kurangiBahan(Bahan.BAUT, 10*jumlah);
                    kurangiBahan(Bahan.CAT, 1*jumlah);
                    kurangiBahan(Bahan.KAYU, 2*jumlah);
                    return true;
                }
            case MEJA:
                if(slotTersedia(barang,jumlah) &&stokBahan.get(Bahan.BAUT)>=20*jumlah && stokBahan.get(Bahan.CAT)>=2*jumlah && stokBahan.get(Bahan.KAYU)>=3*jumlah){
                    kurangiBahan(Bahan.BAUT, 20*jumlah);
                    kurangiBahan(Bahan.CAT, 2*jumlah);
                    kurangiBahan(Bahan.KAYU, 3*jumlah);
                    return true;
                }
            case LEMARI:
                if(slotTersedia(barang,jumlah) &&stokBahan.get(Bahan.BAUT)>=30*jumlah && stokBahan.get(Bahan.CAT)>=3*jumlah && stokBahan.get(Bahan.KAYU)>=5*jumlah){
                    kurangiBahan(Bahan.BAUT, 30*jumlah);
                    kurangiBahan(Bahan.CAT, 3*jumlah);
                    kurangiBahan(Bahan.KAYU, 5*jumlah);
                    return true;
                }     
            default:
                return false;
        }
    }
    private boolean slotTersedia(Toko.Barang barang,int jumlah){
        int a = 0;
        switch (barang) {
            case MEJA:
                a = 10;
                break;
            case KURSI:
                a= 20;
                break;
            case LEMARI:
                a=5;
                break;
        }
        if(isiGudang.get(barang)+jumlah <= a){
            return true;
        }
        return false;
    }
}

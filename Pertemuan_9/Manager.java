public class Manager extends Pegawai {
    public Manager(String nama, String department, String jenisKelamin){
        super(nama, department, jenisKelamin);
    }

    public void setGaji(int gaji){
        super.setGaji(gaji);
        setThr(gaji*2);
    }
}

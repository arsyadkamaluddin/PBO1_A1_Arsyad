public class Salesman extends Pegawai {
    private int target;
    private int penjualan;
    public Salesman(String nama, String department, String jenisKelamin){
        super(nama, department, jenisKelamin);
    }
    public void setPenjualan(int jual){
        this.penjualan=jual;
    }
    public void setTarget(int target){
        this.target = target;
    }
    public void setGaji(int gaji){
        super.setGaji(gaji);
        setThr(penjualan>=target?gaji*2:gaji);
    }
}

public class Pegawai {
    private String nama;
    private String department;
    private String jenisKelamin;
    private int cuti;
    private int gaji;
    private int thr;
    protected String nip;

    public Pegawai(String nama, String department, String jenisKelamin){
        this.nama =nama;
        this.department = department;
        this.jenisKelamin = jenisKelamin;
        this.cuti = 12;
    }
    protected String getNama(){
        return nama;
    }
    protected String getNip(){
        return nip;
    }
    protected String getDepartment(){
        return department;
    }
    protected String getKelamin(){
        return jenisKelamin;
    }
    protected int getCuti(){
        return cuti;
    }
    protected int getGaji(){
        return gaji;
    }
    protected int getThr(){
        return thr;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
        this.thr = gaji;
    }
    protected void setThr(int thr){
        this.thr = thr;
    }
    public void setCuti(int cuti){
        this.cuti += cuti;
    }
    public void setCuti(String cuti){
        if(cuti == "pernikahan"){
            this.cuti += 2;
        }else if(cuti == "persalinan"){
            this.cuti += jenisKelamin=="L"?3:90;
        }
    }
    public void setNip(String nip){
        if(this.getClass().getSimpleName()=="Manager"){
            if(nip.charAt(0)=='M')
            this.nip = nip;
        }else if(this.getClass().getSimpleName()=="Salesman"){
            if(nip.charAt(0)=='S')
            this.nip = nip;
        }else{
            if(nip.charAt(0)=='P')
            this.nip = nip;
        }
    }
    public void setNip(int nip){
        if(this.getClass().getSimpleName()=="Manager"){
            String hasilFormat = String.format("%c%04d", 'M', nip);
            this.nip = hasilFormat;
        }else if(this.getClass().getSimpleName()=="Salesman"){
            String hasilFormat = String.format("%c%04d", 'S', nip);
            this.nip = hasilFormat;
        }else{
            String hasilFormat = String.format("%c%04d", 'P', nip);
            this.nip = hasilFormat;
        }
    }
    public void displayInfo(){
        switch (this.getClass().getSimpleName()) {
            case "Manager":
                System.out.println("Jabatan : Manager");                
                break;
            default:
                System.out.println("Jabatan : Pegawai"); 
                break;
        }
        System.out.println("Nama : "+nama);
        System.out.println("Department : "+department);
        System.out.println("NIP : "+nip);
        System.out.println("Gaji : "+gaji);
        System.out.println("THR : "+thr);
        System.out.println("Cuti : "+cuti);
        System.out.println("=======================");
    }
}

public class Pelanggan {
    public String nama;
    public long  no;
    public Pelanggan(String nama,long no){
        this.nama = nama;
        this.no = no;
    }
    public void namaPelanggan(){
        System.out.println("Nama    : "+nama);
        System.out.println("No Hp   : "+no);
    }
}

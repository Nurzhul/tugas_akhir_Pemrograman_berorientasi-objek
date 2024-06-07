public class Diantar  implements Metode{
    public String komplek;
    public String jalan;
    public int noRumah;
    public int ongkir;

    public  String catta(){
        return ("(Layanan Ongkir / di antar hanya dapat di lakukan di dalam kota jogja )");
    }
    public void catatan(String komplek,String jalan,int noRumah){
        this.komplek = komplek;
        this.jalan = jalan;
        this.noRumah = noRumah;
    }
    @Override
    public void biayaTambahan(){
        ongkir = 10000;
        System.out.println("Alamat ");
        System.out.println("Komplek     : "+komplek);
        System.out.println("Jalan       : "+jalan);
        System.out.println("No Rumah    : "+noRumah);
        System.out.println();
        System.out.println("Ongkir  = "+ongkir);
        System.out.println("----------------------------------------");
    }
}

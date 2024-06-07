import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nama;
        long no;     String kom;
        int mil;    int noR;
        int pil;    String jln;
        int jum;    int durasi;
        int pill;   String all;
        int tam;
        System.out.print("Masukan Nama Anda : ");
        nama = in.nextLine();
        System.out.print("Masukan No Hp anda : ");
        no = in.nextLong();
        Pelanggan pel = new Pelanggan(nama,no);
        Menu men = new Menu();
        men.display();
        System.out.println();
        do{
            System.out.println();
            System.out.print("masukan No menu yang kamu pilih : ");
            pil = in.nextInt();
            men.milih(pil);
            System.out.print("Jumlah nya : ");
            jum = in.nextInt();
            men.jumlah(jum);
            System.out.println();
            System.out.print("Tampah Pesanan (iya(1)/tidak(0) : ");
            mil = in.nextInt();
        }while (mil == 1);
        System.out.println();
        pel.namaPelanggan();
        System.out.println();
        men.struk();
        System.out.println("-----------------------------------");
        Diantar antar = new Diantar();
        Ditempat pat = new Ditempat();
        AmbilSendiri bil = new AmbilSendiri();
        System.out.println("Pesanan Ingin di apakan  ");
        System.out.println("1. Makan Di Restoran(Di tempat)");
        System.out.println("2. ingin Di Antar ke rumah "+antar.catta());
        System.out.println("3. ingin Di Ambil sendiri ");
        System.out.print("Tekan no Yang anda pilih : ");
        pill = in.nextInt();
        if (pill == 1){
            pat.biayaTambahan();
            durasi = men.selujum() * 15;
            tam = men.tottalseluruh()+pat.pajak;
            System.out.println("total nya = "+tam);
            System.out.println();
            System.out.println("-------------------------------------------------");
            System.out.println("Makana akan siap setelah "+durasi+" menit");

        } else if (pill == 2) {

            durasi = men.selujum() * 15;
            System.out.println();
            System.out.println("Masukan Alamat anda : ");
            all = in.nextLine();
            System.out.print("Masukan nama Komplek  : ");
            kom = in.nextLine();
            System.out.print("Masukan nama Jalan    : ");
            jln = in.nextLine();
            System.out.print("Masukan no Rumah      : ");
            noR = in.nextInt();
            System.out.println();
            tam = men.tottalseluruh()+ antar.ongkir;
            antar.catatan(kom,jln,noR);
            antar.biayaTambahan();
            System.out.println("Total  = "+tam);
            System.out.println("-------------------------------------------");
            System.out.println(" makanan akan tiba setelah 1 jam "+durasi+" menit ");
        } else if (pill == 3) {
            durasi = men.selujum() * 15;
            bil.biayaTambahan();
            System.out.println("------------------------");
            System.out.println("Makanan Anda akan siap stelah " + durasi+ " Menit ");
            System.out.println("Silahkan Ambil datang Sebelum "+durasi +" menit ");
            System.out.println("Agar makanan anda tidak dingin");
        }

    }
}
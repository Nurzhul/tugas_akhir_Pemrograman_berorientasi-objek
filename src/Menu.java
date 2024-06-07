public class Menu {
    public int pil;
    public String[] menu = new String[8];
    public int[] harga = new int[8];
    public int[] total = new int[8];
    public int jum;

    public int[] menjum = new int[8];

    int i;


    public void display(){
        System.out.println("|- - --------Menu-------- - -|");
        System.out.println("|No|   nama     |   harga   |");
        System.out.println("- - - - - - MAkanan - - - - - -");
        System.out.println("|1.|Ayam goreng | Rp.10.000 |");
        System.out.println("|2.|Ayam Bakar  | Rp.12.000 |");
        System.out.println("|3.|Stek Ayam   | Rp.15.000 |");
        System.out.println("|4.|Nasi putih  | Rp. 6.000 |");
        System.out.println();
        System.out.println("|No|   nama     |   harga   |");
        System.out.println("----- - - -Minuman- - - ------ ");
        System.out.println("|5.|Air Mnineral| Rp. 5.000 |");
        System.out.println("|6.|Es teh      | Rp. 7.000 |");
        System.out.println("|7.|Lemon tea   | Rp. 8.000 |");
        System.out.println("|8.|Capucino    | Rp.10.000 |");
        menu[0] = "Ayam Goreng ";
        menu[1] = "Ayam Bakar ";
        menu[2] = "Stek Ayam ";
        menu[3] = "Nasi Putih ";
        menu[4] = "Air Mineral ";
        menu[5] = "Es Teh ";
        menu[6] = "Lemon Tea ";
        menu[7] = "Capucino";
    }
    public void milih(int pil){
        this.pil = pil;
        if (pil == 1){
            harga[0] = 10000;
        } else if (pil == 2) {
            harga[1] = 12000;
        } else if (pil == 3) {
            harga[2] = 15000;
        } else if (pil == 4) {
            harga[3] = 6000;
        } else if (pil == 5) {
            harga[4] = 5000;
        } else if (pil == 6) {
            harga[5] = 7000;
        } else if (pil == 7) {
            harga[6] = 8000;
        } else if (pil == 8) {
            harga[7] = 10000;
        }else {
            System.out.println("Menu Tidak tersedia ");
        }
    }
    public void jumlah(int jum){
        this.jum = jum;
        if (pil == 1){
            total[0] = harga[0]*jum;
            menjum[0] = jum;
            System.out.println("total  : "+total[0]);
        } else if (pil == 2) {
            total[1] = harga[1]*jum;
            menjum[1] = jum;
            System.out.println("total  : "+total[1]);
        } else if (pil == 3) {
            total[2] = harga[2]*jum;
            menjum[2] = jum;
            System.out.println("total  : "+total[2]);
        } else if (pil == 4) {
            total[3] = harga[3]*jum;
            menjum[3] = jum;
            System.out.println("total  : "+total[3]);
        } else if (pil == 5) {
            total[4] = harga[4]*jum;
            menjum[4] = jum;
            System.out.println("total  : "+total[4]);
        } else if (pil == 6) {
            total[5] = harga[5]*jum;
            menjum[5] = jum;
            System.out.println("total  : "+total[5]);
        } else if (pil == 7) {
            total[6] = harga[6]*jum;
            menjum[6] = jum;
            System.out.println("total  : "+total[6]);
        } else if (pil == 8) {
            total[7] = harga[7]*jum;
            menjum[7] = jum;
            System.out.println("total  : "+total[7]);
        }
    }
    public int tottalseluruh() {
        return total[0]+total[1]+total[2]+total[3]+total[4]+total[5]+total[6]+total[7];
    }
    public void struk(){
        System.out.println("Menu \t\t| Jumlah \t\t| Total");
        for( i = 0; i<8;i++){

            System.out.println(menu[i]+" \t| "+menjum[i]+" \t\t| "+total[i]);

        }
        System.out.println("________________________________________");
        System.out.println("Total seluruh : "+tottalseluruh());
    }
    public int selujum(){
        return menjum[0]+menjum[1]+menjum[2]+menjum[3]+menjum[4]+menjum[5]+menjum[6]+menjum[7];
    }
}

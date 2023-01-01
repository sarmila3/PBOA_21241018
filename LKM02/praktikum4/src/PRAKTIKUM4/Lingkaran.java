package PRAKTIKUM4;
class HitunganLingkaran {
    double jarijari;
    double phi;
    double keliling,luas;

    HitunganLingkaran(int jarijari,double phi){
        this.jarijari = jarijari;
        this.phi = phi;
        this.keliling = 2*phi*jarijari;
        this.luas = phi*jarijari*jarijari;

    }
    void show(){
        System.out.println("======LINGKARAN=======");
        System.out.println("Jari-Jari Lingkaran : " + this.jarijari + " cm");
        System.out.println("Keliling Lingkaran : " + this.keliling + " cm");
        System.out.println("Luas Lingkaran : " + this.luas + " cm2 ");
    }
}
    

public class Lingkaran {
    public static void main(String[] args) {
        HitunganLingkaran HL1 = new HitunganLingkaran(7, 3.14);
        HL1.show();
        HitunganLingkaran HL2 = new HitunganLingkaran(3, 3.14);
        HL2.show();
        HitunganLingkaran HL3 = new HitunganLingkaran(9, 3.14);
        HL3.show();
    }
}

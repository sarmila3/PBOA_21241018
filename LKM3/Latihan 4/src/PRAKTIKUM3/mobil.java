package PRAKTIKUM3;

public class mobil extends kendaraan{
    //overriding method
    @Override
    void bergerak() {
        System.out.println("Mobil Bergerak!");
    }

    //main class
    public static void main(String[] args) {
        //membuat objek mobil
        mobil car = new mobil();

        //pbjek car menggunakan metode bergerak()
        car.bergerak();
    }
}

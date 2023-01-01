class Mahasiswa{
    public String nama;
    private double nilai;

    Mahasiswa(String nama, double nilai){
        this.nama = nama;
        this.nilai = nilai;
    }

    void display(){
        System.out.println("Nama\t\t : " + this.nama);
        System.out.println("Nilai\t\t : " + this.nilai);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa("Yastry", 85.5);

        mhs.display();
    }
}

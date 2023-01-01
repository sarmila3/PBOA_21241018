class Mahasiswa{
    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int Umur;

    Mahasiswa (String InputNama, String InputNIM, String InputJurusan, double InputIPk, int InputUmur){
        Nama = InputNama;
        NIM = InputNIM;
        Jurusan = InputJurusan;
        IPK = InputIPk;
        Umur = InputUmur;

        System.out.println(Nama);
        System.out.println(NIM);
        System.out.println(Jurusan);
        System.out.println(IPK);
        System.out.println(Umur);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Yastry Yunanti", "21241003", "PTI", 3.81, 19);

        Mahasiswa mhs2 = new Mahasiswa("Nagisa", "21241004", "PTI", 3.80, 19);

        Mahasiswa mhs3 = new Mahasiswa("Rizki", "21241005", "PTI", 3.78, 20);

        Mahasiswa mhs4 = new Mahasiswa("Woosik", "21241006", "PTI", 3.88, 20);

        Mahasiswa mhs5 = new Mahasiswa("Ren", "21241007", "PTI", 3.89, 20);
        
        
    }
}

   

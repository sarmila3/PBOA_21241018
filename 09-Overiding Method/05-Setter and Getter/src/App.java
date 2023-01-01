class Ling{
    private double diameter;

    public Ling(double diameter){
        this.diameter = diameter;
    }
    // getter
    public double getjari2(){
        return this.diameter/2;
    }

    //setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    public double getHitungLuas(){
        return 3.14*getjari2()*getjari2();
    }

    public double getHitungKeliling(){
        return 2*3.14*getjari2();
    }

    public void display(){
        System.out.println("Diameter\t\t :" + this.diameter);
        System.out.println("Jari-Jari\t\t : " + getjari2());
        System.out.println("Luas \t\t\t :" + getHitungLuas());
        System.out.println("Keliling\t\t : " + getHitungKeliling());
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Ling Lingkaran = new Ling(4.2);

        Lingkaran.display();
    }
}

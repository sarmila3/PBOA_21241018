package com.tutorial;

public class Lingkaran extends BangunDatar{
    //jari jari lingkaran
    float r;
    
    public void setR(float r) {
        this.r = r;
    }
    void luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
    }
    void keliling(){
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}

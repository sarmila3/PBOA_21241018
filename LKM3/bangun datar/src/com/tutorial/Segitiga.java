package com.tutorial;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    public void setSegitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    void luas(){
        float luas = 2 / (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
    }
    void keliling(){
        float keliling = 3 * alas;
        System.out.println("Keliling Segitiga: " + keliling);
    }
}

package com.tutorial;

public class persegiPanjang extends BangunDatar{
    float panjang;
    float lebar;

    public void setpersegiPanjang(float panjang, float lebar){
        this.panjang= panjang;
        this.lebar=lebar;
    }
    void luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    void keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
    }
}

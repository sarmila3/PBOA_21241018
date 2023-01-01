package com.tutorial;

 class HeroStrenght extends Hero{
    //atribut
    double defencePower;

    //method overriding
    void display(){
        System.out.println("Hero Strenght");
        System.out.println("Nama Hero : " + this.name);
        System.out.println("Defance Power : " + this.defencePower);
    }
}



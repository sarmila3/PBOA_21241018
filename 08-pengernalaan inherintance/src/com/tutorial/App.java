package com.tutorial;
    


public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi atau penciptaan objek
        Hero hero1 = new Hero();
        hero1.name = "Iron Man";
        hero1.display();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "Supidermen";
        hero2.display();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Naruto";
        hero3.display();
        }
}

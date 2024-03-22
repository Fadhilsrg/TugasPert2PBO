package SeluruhKucing;

public class kucingHitam extends kucing{
    String rambut = "Mohawk";
    String luka = "Gores pada mata";

    void display(){
        super.meowSound();
        System.out.println("Rambut = " + rambut);
        System.out.println("Luka = " + luka);
    }
}

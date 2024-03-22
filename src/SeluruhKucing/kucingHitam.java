package SeluruhKucing;

public class kucingHitam extends kucing{
    String rambut = "Mohawk";
    String luka = "Gores pada mata";

    void display(){
        super.bunyiKucing();
        super.normalCharacteristic();
        System.out.println("Rambut = " + rambut);
        System.out.println("Luka = " + luka);
        System.out.println(" ");
    }
}

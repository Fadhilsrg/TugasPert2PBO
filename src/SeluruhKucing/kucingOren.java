package SeluruhKucing;
public class kucingOren extends kucing {
    String warnaMata = "hijau";
    String kuping = "Caplang";

    void display(){
        super.meowSound();
        System.out.println("Warna Mata = " + warnaMata);
        System.out.println("Kuping = " + kuping);
    }
}
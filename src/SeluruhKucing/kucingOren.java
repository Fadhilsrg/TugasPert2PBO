package SeluruhKucing;
public class kucingOren extends kucing {
    String warnaMata = "hijau";
    String kuping = "Caplang";

    void display(){
        super.bunyiKucing();
        super.normalCharacteristic();
        System.out.println("Warna Mata = " + warnaMata);
        System.out.println("Kuping = " + kuping);
        System.out.println(" ");
    }
}
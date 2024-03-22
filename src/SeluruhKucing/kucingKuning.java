package SeluruhKucing;

public class kucingKuning extends kucing{
    int ekor = 2;
    String bau = "Bawang Merah";

    void display(){
        super.bunyiKucing();
        super.kakiCacat();
        super.normalCharacteristic();
        System.out.println("ekor = " + ekor);
        System.out.println("bau = " + bau);
        System.out.println(" ");
    }
}

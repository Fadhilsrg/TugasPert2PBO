package SeluruhKucing;

public class Main {
    public static void main(String[] args) {
        kucingOren a = new kucingOren();
        a.pastiKucing("orange", "ikan", 4, true);
        a.display();

        kucingHitam b = new kucingHitam();
        b.pastiKucing("hitam", "ayam", 4, false);
        b.display();

        kucingKuning c = new kucingKuning();
        c.pastiKucing("kuning", "teri", 4, true);
        c.display();
    }
}
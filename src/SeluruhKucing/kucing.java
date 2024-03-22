package SeluruhKucing;

public class kucing {
    String warnaKulit;
    String makanan;
    int kaki;
    boolean gemes;

    void pastiKucing(String warnaKulit, String makanan, int kaki, boolean gemes){
        this.warnaKulit = warnaKulit;
        this.makanan = makanan;
        this.kaki = kaki;
        this.gemes = gemes;
    }

    void bunyiKucing(){
        System.out.println("Meooww.. Meoww..");
    }

    void normalCharacteristic(){
        System.out.println("Warna kulit = " + warnaKulit);
        System.out.println("Makanan = " + makanan);
        System.out.println("Jumlah Kaki = " + kaki);
        System.out.println("Gemes BANGETT ?!?!? = " + gemes);
        System.out.println(" ");
        System.out.println("Karakteristik");
    }

    void kakiCacat(){
        kaki = --kaki;
        System.out.println("Mempunyai kaki yang cacat");
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Alice");
        daftarNama.add("Bob");
        daftarNama.add("Charlie");

        String namaPertama = daftarNama.get(0);
        System.out.println("Nama pertama: " + namaPertama);

        daftarNama.remove(1);
        System.out.println("Daftar nama setelah menghapus Bob: " + daftarNama);

        int jumlahNama = daftarNama.size();
        System.out.println("Jumlah nama dalam daftar: " + jumlahNama);

        boolean adaCharlie = daftarNama.contains("Charlie");
        System.out.println("Apakah Charlie ada dalam daftar? " + adaCharlie);

        daftarNama.set(0, "Alex");
        System.out.println("Daftar nama setelah mengubah Alice menjadi Alex: " + daftarNama);

        daftarNama.clear();
        System.out.println("Daftar nama setelah menghapus semua elemen: " + daftarNama);
    }
}

package CM2;

public class Pesanan20 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    Pesanan20(int kode, String nama, int harga){
        kodePesanan = kode;
        namaPesanan = nama;
        this.harga = harga;
    }

    void tampil(){
        System.out.println(kodePesanan + "\t\t" + namaPesanan + "\t\t" + harga);
    }
}

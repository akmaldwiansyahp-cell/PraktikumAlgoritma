package Ujian;

public class SistemCafe {
    public String id_order;
    public String atasNama;
    public int jumlahPelangganPerMeja;
    public int jumlahMenuDipesan;

    int TambahPelanggan(int angka, boolean status){
        if(status){
            jumlahPelangganPerMeja += angka;
        }else{
            jumlahPelangganPerMeja -= angka;
        }
        return jumlahPelangganPerMeja;
    }

    void GantiNama(String nama){
        atasNama = nama;
    }

    void TampilkanData(){
        System.out.println("---------------------------------");
        System.out.println("ID Order : " + id_order);
        System.out.println("Atas Nama: " + atasNama);
        System.out.println("Jumlah Pelanggan Per Meja : " + jumlahPelangganPerMeja);
        System.out.println("Jumlah Menu Yang Dipesan Per Meja : " + jumlahMenuDipesan);
        System.out.println("---------------------------------");
    }

    public SistemCafe(){

    }

    public SistemCafe(String id, String nama, int pelanggan, int menu){
        id_order = id;
        atasNama = nama;
        jumlahPelangganPerMeja = pelanggan;
        jumlahMenuDipesan = menu;
    }
}

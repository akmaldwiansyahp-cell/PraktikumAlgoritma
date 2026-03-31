package Praktikum05;

public class Dosen20 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen20(){

    }

    Dosen20(String kode, String nama, boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil(){
        System.out.println("Kode             : " + kode);
        System.out.println("Nama             : " + nama);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin    : Pria");
        }else{
            System.out.println("Jenis Kelamin    : Wanita");
        }
        System.out.println("Usia             : " + usia);
    }
}

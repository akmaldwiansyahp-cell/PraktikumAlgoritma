package CM1.CM1_Revisi;

public class Peminjaman20_1 {
        Mahasiswa20_1 mahasiswa;
    Buku20_1 buku;
    int idx;
    
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman20_1(Mahasiswa20_1 mhs, Buku20_1 buku, int lamaPinjam){
        mahasiswa = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda(){
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat < 0) {
            terlambat = 0;
        }
        if (terlambat > 0) {
            denda = terlambat * 2000;
        }
    }

    void tampilkanPeminjaman(){
        System.out.print("Nama: " + mahasiswa.nama + " | ");
        System.out.print("Judul: " + buku.judul + " | ");
        System.out.print("Lama Pinjam: " + lamaPinjam + " | ");
        System.out.print("Terlambat: " + terlambat + " | ");
        System.out.println("Denda: " + denda);
    }
}

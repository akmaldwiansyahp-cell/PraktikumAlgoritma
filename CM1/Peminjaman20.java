package CM1;

public class Peminjaman20 {
    Mahasiswa20 mahasiswa;
    Buku20 buku;
    int idx;
    
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman20(Mahasiswa20 mhs, Buku20 buku, int lamaPinjam){
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

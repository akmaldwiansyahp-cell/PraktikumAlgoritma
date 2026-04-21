package CM1.CM1_Revisi;

public class Buku20_1 {
        String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku20_1(String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku(){
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul       : " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("----------------------------");
    }
}

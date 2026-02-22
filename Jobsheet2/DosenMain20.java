public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "1";
        dosen1.nama = "Dosen 1";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1999;
        dosen1.bidangKeahlihan = "Matematika";

        dosen1.TampilkanInformasi();
        dosen1.ubahKeahlihan("Praktikum ASD");
        dosen1.hitungMasaKerja(2025);
        dosen1.setStatusAktif(false);
        dosen1.TampilkanInformasi();
        
    }
}

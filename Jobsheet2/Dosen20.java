public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlihan;

    void TampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang: " + bidangKeahlihan);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunSekarang){
        tahunSekarang -= tahunBergabung;
        return tahunSekarang;
    }

    void ubahKeahlihan(String Bidang){
        bidangKeahlihan = Bidang;
    }

    public Dosen20(){

    }

    public Dosen20(String id, String nama, boolean status, int bergabung, String keahlihan){
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = bergabung;
        bidangKeahlihan = keahlihan;
    }
}

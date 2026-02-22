public class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void TampilkanInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        jumlahJam -= jam;
    }

    public MataKuliah20(){

    }

    public MataKuliah20(String MK, String nama, int sks, int jam){
        kodeMK = MK;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jam;
    }
}

public class Mahasiswa20 {

    String nama;
    String nim;
    String kelas;
    double ipk;


    void TampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void UbahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void UpdateIpk(double IpkBaru){
        ipk = IpkBaru;
    }

    String nilaiKinerja(double ipk){
        if(ipk > 0.0 && ipk <= 4.0){
            if(ipk >= 3.5){
                return "Kinerja Sangat Baik";
            }else if(ipk >= 3.0){
                return "Kinerja Baik";
            }else if(ipk  >= 2.0){
                return "Kinerja Cukup";
            }else{
                return "Kinerja Kurang";
            }
        }else{
            return "IPK tidak valid. Harus antara 0.0 dan 4.0";
        }
    }

    public Mahasiswa20(){

    }

    public Mahasiswa20(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}

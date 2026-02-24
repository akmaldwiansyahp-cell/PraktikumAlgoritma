public class DataDosen20 {

    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    void dataSemuaDosen(Dosen20[] arrayOfDosen){
        int i = 1;
        for (Dosen20 dosen20 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i++);
            System.out.println("Kode         : " + dosen20.kode);
            System.out.println("Nama         : " + dosen20.nama);
            System.out.println("Jenis Kelamin: " + ((dosen20.jenisKelamin == true) ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dosen20.usia);
            System.out.println("----------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen){
        int pria = 0;
        int wanita = 0;
        for (Dosen20 dosen20 : arrayOfDosen) {
            if(dosen20.jenisKelamin == true){
                pria++;
            }else{
                wanita++;
            }
        }
        System.out.println("Terdapat " + pria + " Pria Karyawan");
        System.out.println("Terdapat " + wanita + " Wanita Karyawan");
    }

    void rataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen){
        int pria = 0, UsiaPria = 0;
        int wanita = 0, UsiaWanita = 0;
        for (Dosen20 dosen20 : arrayOfDosen) {
            if(dosen20.jenisKelamin == true){
                pria++;
                UsiaPria += dosen20.usia;
            }else{
                wanita++;
                UsiaWanita += dosen20.usia;
            }
        }
        System.out.println("Rata-rata usia karyawan pria adalah " + (UsiaPria / pria) + " tahun");
        System.out.println("Rata-rata usia karyawan wanita adalah " + (UsiaWanita / wanita) + " tahun");
    }

    void infoDosenPalingTua(Dosen20[] arrayOfDosen){
        Dosen20 tertua = arrayOfDosen[0];
        for (Dosen20 dosen20 : arrayOfDosen) {
            if(dosen20.usia > tertua.usia){
                tertua = dosen20;
            }
        }
        System.out.println("===DOSEN TERTUA===");
        System.out.println("Kode         : " + tertua.kode);
        System.out.println("Nama         : " + tertua.nama);
        System.out.println("Jenis Kelamin: " + ((tertua.jenisKelamin == true) ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + tertua.usia);
        System.out.println("----------------------------");
    }

    void infoDosenPalingMuda(Dosen20[] arrayOfDosen){
        Dosen20 termuda = arrayOfDosen[0];
        for (Dosen20 dosen20 : arrayOfDosen) {
            if(dosen20.usia < termuda.usia){
                termuda = dosen20;
            }
        }
        System.out.println("===DOSEN TERMUDA===");
        System.out.println("Kode         : " + termuda.kode);
        System.out.println("Nama         : " + termuda.nama);
        System.out.println("Jenis Kelamin: " + ((termuda.jenisKelamin == true) ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + termuda.usia);
        System.out.println("----------------------------");
    }

}

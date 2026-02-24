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
        System.out.println("Terdapat " + pria + " Wanita Karyawan");
    }

}

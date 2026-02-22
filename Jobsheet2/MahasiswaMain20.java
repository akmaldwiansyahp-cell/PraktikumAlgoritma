public class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhsw1 = new Mahasiswa20();
        mhsw1.nama = "Muhammad Akmal Dwiansyah Putra";
        mhsw1.nim = "254107020110";
        mhsw1.kelas = "TI 1G";
        mhsw1.ipk = 3.82;

        mhsw1.TampilkanInformasi();
        mhsw1.UbahKelas("TI 2G");
        mhsw1.UpdateIpk(4);
        mhsw1.TampilkanInformasi();


        Mahasiswa20 mhsw2 = new Mahasiswa20("Annisa Nabila", "254107020112", 3.25, "TI 2L");
        mhsw2.UpdateIpk(3.30);
        mhsw2.TampilkanInformasi();

        Mahasiswa20 mhswAkmal = new Mahasiswa20("Muhammad Akmal Dwiansyah Putra", "254107020110", 3.82, "TI 1G");
        mhswAkmal.TampilkanInformasi();
        
    }
}

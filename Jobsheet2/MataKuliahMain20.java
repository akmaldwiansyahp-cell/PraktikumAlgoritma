public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 MK1 = new MataKuliah20();
        MK1.kodeMK = "1";
        MK1.nama = "Matematika";
        MK1.sks = 2;
        MK1.jumlahJam = 4;

        MK1.TampilkanInformasi();
        MK1.ubahSKS(3);
        MK1.kurangiJam(3);
        MK1.tambahJam(4);
        MK1.TampilkanInformasi();

        System.out.println("");

        MataKuliah20 MK2 = new MataKuliah20("2", "Praktikum ASD", 6, 6);
        MK2.TampilkanInformasi();
        MK2.ubahSKS(5);
        MK2.TampilkanInformasi();

    }
}

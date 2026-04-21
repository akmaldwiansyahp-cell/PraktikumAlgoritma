package Jobsheet5.BruteForceDivideConquer;

public class MainMahasiswa20 {
    public static void main(String[] args) {
        Mahasiswa[] mhsw = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa akses = new Mahasiswa();

        System.out.println("Nilau UTS tertinggi menggunakan Divide and Conquer: " + akses.MaxUTS(mhsw, 0, mhsw.length-1));
        System.out.println("Nilau UTS terendah menggunakan Divide and Conquer: " + akses.MinUTS(mhsw, 0, mhsw.length-1));
        System.out.println("Nilau rata rata UAS Menggunakan Brute Force: " + akses.rataUAS(mhsw));
    }
}

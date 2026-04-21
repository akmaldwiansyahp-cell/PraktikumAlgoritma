package CM1.CM1_Revisi;

import java.util.Scanner;

public class DemoCM20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeminjamanData20 data = new PeminjamanData20();
        
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Exit");
            System.out.print("Pilih Menu: ");
            int x = sc.nextInt();
            System.out.println("");
            switch (x) {
                case 1:
                    data.tampilDataMahasiswa();
                    break;
                case 2:
                    data.tampilDataBuku();
                    break;
                case 3:
                    data.tampilDataPeminjaman();
                    break;
                case 4:
                    data.InsertionSort();
                    break;
                case 5:
                    data.SelectionSearch();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    break;
            }
        } while (true);
    }
}

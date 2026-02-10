package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal (tabel)");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan nama mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Seluruh Jadwal Kuliah ===");
                    tampilkanJadwal(jadwal, n);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang dicari: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalHari(jadwal, n, hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah (bisa sebagian): ");
                    String mk = sc.nextLine();
                    tampilkanJadwalMataKuliah(jadwal, n, mk);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        sc.close();
    }


    static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.printf("=== Jadwal %d ===\n", i + 1);
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
    }


    static void tampilkanJadwal(String[][] jadwal, int n) {
        System.out.printf("%-20s %-20s %-10s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20s %-10s %-15s%n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }


    static void tampilkanJadwalHari(String[][] jadwal, int n, String hari) {
        System.out.printf("=== Jadwal Kuliah Hari %s ===%n", hari.trim());
        System.out.printf("%-20s %-20s %-10s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari.trim())) {
                System.out.printf("%-20s %-20s %-10s %-15s%n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }


    static void tampilkanJadwalMataKuliah(String[][] jadwal, int n, String mk) {
        System.out.printf("=== Jadwal Mata Kuliah yang mengandung: %s ===%n", mk.trim());
        System.out.printf("%-20s %-20s %-10s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].toLowerCase().contains(mk.toLowerCase().trim())) {
                System.out.printf("%-20s %-20s %-10s %-15s%n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal dengan nama tersebut.");
        }
    }

}

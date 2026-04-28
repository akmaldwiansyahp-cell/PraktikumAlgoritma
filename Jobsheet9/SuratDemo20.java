package Jobsheet9;

import java.util.Scanner;

public class SuratDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackSurat20 stack = new StackSurat20(3);
        int pilih;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih Menu:");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String ID = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin(S/I): ");
                    char izin = sc.findInLine(".").charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat20 surat = new Surat20(ID, nama, kelas, izin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat20 proses = stack.pop();
                    if (proses != null) {
                    System.out.println("Memproses Surat Dari " + proses.namaMahasiswa);
                    System.out.print("Input Status (Terima / Tidak Diterima): ");
                    String status = sc.nextLine();
                    System.out.printf("Surat %s %s\n", proses.namaMahasiswa, status);
                    }
                    break;
                case 3:
                    Surat20 lihat = stack.LihatTerakhir();
                    if (lihat != null) {
                        System.out.println("Surat terakhir berasal dari " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Input nama Mahasiswa: ");
                    String nama2 = sc.nextLine();
                    if (stack.cariSurat(nama2)) {
                        System.out.println("Data Ditemukan");
                    }else{
                        System.out.println("Data Tidak Ditemukan");
                    }
                    break;
                default:
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}

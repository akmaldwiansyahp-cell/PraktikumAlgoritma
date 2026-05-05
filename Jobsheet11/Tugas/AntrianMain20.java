package Jobsheet11.Tugas;

import java.util.Scanner;

public class AntrianMain20 {
    public static void menu(){
        System.out.println("\n=== Menu Proses KRS Mahasiswa ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Memproses KRS");
        System.out.println("3. Cek full");
        System.out.println("4. Cek kosong");
        System.out.println("5. Tampilkan semua");
        System.out.println("6. Tampilkan kedua terdepan");
        System.out.println("7. Tampilkan terbelakang");
        System.out.println("8. Jumlah antrian");
        System.out.println("0. Keluar");
        System.out.println("====================================");
        System.out.print("Pilih menu: ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;

        LinkedListAntrian20 list = new LinkedListAntrian20();

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa20 siswa = new Mahasiswa20(nim, nama, kelas, ipk);
                    list.TambahAntrian(siswa);
                    break;
                case 2:
                    list.Pemanggilan();
                    break;
                case 3:
                    list.CekPenuh();
                    break;
                case 4:
                    list.CekKosong();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    list.Terdepan();
                    break;
                case 7:
                    list.Terbelakang();
                    break;
                case 8:
                    System.out.println("Terdapat Sebanyak: " + list.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
            
        } while (pilih != 0);

        sc.close();
    }
}

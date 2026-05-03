package Jobsheet10;

import java.util.Scanner;

public class LayananKRS {
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
        System.out.println("9. Jumlah yang sudah di proses");
        System.out.println("10. Jumlah yang belum di proses");
        System.out.println("11. Kosongkan antrian");
        System.out.println("0. Keluar");
        System.out.println("====================================");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;

        AntrianKRS antrian = new AntrianKRS();

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
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa siswa = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.TambahAntrian(siswa);
                    break;
                case 2:
                    antrian.ProsesKRS();
                    break;
                case 3:
                    antrian.CekPenuh();
                    break;
                case 4:
                    antrian.CekKosong();
                    break;
                case 5:
                    antrian.TampilkanSemua();
                    break;
                case 6:
                    antrian.LihatTerdepan();
                    break;
                case 7:
                    antrian.LihatTerbelakang();
                    break;
                case 8:
                    System.out.println("Terdapat Sebanyak: " + antrian.GetJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Terdapat Sebanyak: " + antrian.GetJumlahProses());
                    break;
                case 10:
                    System.out.println("Terdapat Sebanyak: " + antrian.GetJumlahSisa());
                    break;
                case 11:
                    antrian.ClearAntrian();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
            
        } while (pilih != 0 || antrian.jumlahSisa < 0);
        sc.close();
    }        
}


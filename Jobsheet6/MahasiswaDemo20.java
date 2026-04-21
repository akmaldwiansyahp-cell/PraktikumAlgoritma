package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        
        System.out.print("Masukkan Jumlah Mahasiswa yang Diinput: ");
        int jumlah = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input Data Mahasiswa ke-" + (i+1) + ":");

            String nim, nama, kelas;
            double ipk;

            System.out.print("Masukkan NIM    :");
            nim = sc.nextLine();
            
            System.out.print("Masukkan Nama   :");
            nama = sc.nextLine();

            System.out.print("Masukkan Kelas    :");
            kelas = sc.nextLine();

            System.out.print("Masukkan IPK    :");
            ipk = sc.nextDouble();

            sc.nextLine();

            Mahasiswa20 mahasiswa20 = new Mahasiswa20(nim, nama, kelas, ipk);
            list.Tambah(mahasiswa20);
        }

        list.Tampil();

        System.out.println("-----------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------");
        System.out.print("Input IPK Mahasiswa yang ingin dicari: ");
        double cari = sc.nextDouble();

        System.out.println("-----------------------------");
        System.out.println("Menggunakan Binary Searching");
        System.out.println("-----------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);

        System.out.println("Menggunakan Binary Searching");
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);



        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.SequentialSearch(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        sc.close();
    }
}

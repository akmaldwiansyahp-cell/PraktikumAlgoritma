package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        for (int i = 0; i < 5; i++) {
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
        // Mahasiswa20 m1 = new Mahasiswa20("123", "Zidan", "2A", 3.2);
        // Mahasiswa20 m2 = new Mahasiswa20("124", "Ayu", "2A", 3.5);
        // Mahasiswa20 m3 = new Mahasiswa20("125", "Sofi", "2A", 3.1);
        // Mahasiswa20 m4 = new Mahasiswa20("126", "Sita", "2A", 3.9);
        // Mahasiswa20 m5 = new Mahasiswa20("127", "Miki", "2A", 3.7);

        // list.Tambah(m1);
        // list.Tambah(m2);
        // list.Tambah(m3);
        // list.Tambah(m4);
        // list.Tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting");
        list.Tampil();

        // System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC)");
        // list.BubbleSort();
        // list.Tampil();

        // System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (ASC)");
        // list.SelectionSort();
        // list.Tampil();

        // System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (ASC)");
        // list.InsertionSort();
        // list.Tampil();

        sc.close();
    }
}

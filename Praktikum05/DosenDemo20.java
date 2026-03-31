package Praktikum05;

import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 data = new DataDosen20();

        while (true) {
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. SortingASC");
            System.out.println("4. SortingDSC");
            System.out.println("5. Insertion Sorting");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu:");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.print("Input Jumlah Data yang ingin dimasukkan: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < b; i++) {
                        System.out.println("Masukkan Data Dosen Ke-" + (i+1) + ":");
                    
                        String kode, nama, temp;
                        boolean jenisKelamin;
                        int usia;

                        System.out.print("Kode           : ");
                        kode = sc.nextLine();

                        System.out.print("Nama           : ");
                        nama = sc.nextLine();

                        System.out.print("Jenis Kelamin  : ");
                        temp = sc.nextLine();
                        if (temp.equalsIgnoreCase("Pria")) {
                            jenisKelamin = true;
                        }else{
                            jenisKelamin = false;
                        }

                        System.out.print("Usia           : ");
                        usia = sc.nextInt();

                        sc.nextLine();

                        Dosen20 dosen = new Dosen20(kode, nama, jenisKelamin, usia);
                        data.tambah(dosen);
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    data.tampil();
                    break;
                case 4:
                    data.SortingDSC();
                    data.tampil();
                    break;
                case 5:
                    data.InsertionSort();
                    data.tampil();
                    break;
                default:
                    sc.close();
                    return;
            }
        }
    }
}

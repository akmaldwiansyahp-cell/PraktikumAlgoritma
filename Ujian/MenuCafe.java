package Ujian;

import java.util.Scanner;

public class MenuCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Jumlah Meja:");
        int a = sc.nextInt();
        sc.nextLine();
        String dummy;
        String id, nama;
        int pelanggan, menu;

        SistemCafe[] arrayOfCafe = new SistemCafe[a];

        for (int i = 0; i < arrayOfCafe.length; i++) {
            System.out.println("Input Data Order ke-" + (i+1));
            System.out.print("Masukkan ID Order                       : ");
            dummy = sc.nextLine();
            id = dummy;
            System.out.print("Atas Nama                             : ");
            nama = sc.nextLine();
            System.out.print("Masukkan Jumlah Pelanggan Per Meja      : ");
            dummy = sc.nextLine();
            pelanggan = Integer.parseInt(dummy);
            System.out.print("Masukkan Menu yang Dipesan Meja tersebut: ");
            dummy = sc.nextLine();
            menu = Integer.parseInt(dummy);


            arrayOfCafe[i] = new SistemCafe(id, nama, pelanggan, menu);
        }

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Ganti Nama");
            System.out.print("Pilih Menu Angka: ");
            int A = sc.nextInt();
            sc.nextLine();
            String B;
            int b;
            String c;
            switch (A) {
                case 1: 
                for (int i = 0; i < arrayOfCafe.length; i++) {
                    arrayOfCafe[i].TampilkanData();
                }
                break;

                case 2:
                System.out.print("ID Order : ");
                B = sc.nextLine();
                System.out.print("Mengurangi atau Menambahkan: ");
                c = sc.nextLine();
                System.out.print("Input Berapa Banyak: ");
                b = sc.nextInt();
                for (int i = 0; i < arrayOfCafe.length; i++) {
                    if (arrayOfCafe[i].id_order.equalsIgnoreCase(B)) {
                        if (c.equalsIgnoreCase("Menambahkan")) {
                            arrayOfCafe[i].TambahPelanggan(b, true);
                            arrayOfCafe[i].TampilkanData();
                        }else{
                            arrayOfCafe[i].TambahPelanggan(b, false);
                            arrayOfCafe[i].TampilkanData();
                        }
                    }
                }
                break;

                case 3: 
                System.out.print("ID Order : ");
                B = sc.nextLine();
                System.out.print("Nama: ");
                c = sc.nextLine();
                for (int i = 0; i < arrayOfCafe.length; i++) {
                    if (arrayOfCafe[i].id_order.equalsIgnoreCase(B)) {
                        arrayOfCafe[i].atasNama = c;
                        arrayOfCafe[i].TampilkanData();
                    }
                }
    
                break;
                default: 
                sc.close();
                return;
            }
        }   
        }



    
}

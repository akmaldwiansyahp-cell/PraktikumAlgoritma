package CM1;

import java.util.Scanner;

public class PeminjamanDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa20[] listSiswa = new Mahasiswa20[3];
        listSiswa[0] = new Mahasiswa20("22001", "Andi", "Teknik Informatika"); 
        listSiswa[1] = new Mahasiswa20("22002", "Budi", "Teknik Informatika"); 
        listSiswa[2] = new Mahasiswa20("22003", "Citra", "Sistem Informasi");
        
        Buku20[] listBuku20 = new Buku20[4];
        listBuku20[0] = new Buku20("B001", "Algoritma", 2020);
        listBuku20[1] = new Buku20("B002", "Basis Data", 2019);
        listBuku20[2] = new Buku20("B003", "Pemrograman", 2021);
        listBuku20[3] = new Buku20("B004", "Fisika", 2024);

        Peminjaman20[] listPeminjaman20 = new Peminjaman20[5];
        listPeminjaman20[0] = new Peminjaman20(listSiswa[0], listBuku20[0], 7);
        listPeminjaman20[1] = new Peminjaman20(listSiswa[1], listBuku20[1], 3);
        listPeminjaman20[2] = new Peminjaman20(listSiswa[2], listBuku20[2], 10);
        listPeminjaman20[3] = new Peminjaman20(listSiswa[2], listBuku20[3], 6);
        listPeminjaman20[4] = new Peminjaman20(listSiswa[0], listBuku20[1], 4);

        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Cari Berdasarkan Kode Buku");
            System.out.println("7. Exit");
            System.out.print("Pilih Menu: ");
            int x = sc.nextInt();
            System.out.println("");
            switch (x) {
                case 1:
                    for (int i = 0; i < listSiswa.length; i++) {
                        listSiswa[i].tampilMahasiswa();
                    }
                    break;
                case 2:
                    for (int i = 0; i < listBuku20.length; i++) {
                        listBuku20[i].tampilBuku();
                    }
                    break;
                case 3:
                    for (int i = 0; i < listPeminjaman20.length; i++) {
                        listPeminjaman20[i].tampilkanPeminjaman();
                    }
                    break;
                case 4:
                    for (int i = 0; i < listPeminjaman20.length; i++) {
                        Peminjaman20 temp = listPeminjaman20[i];
                        int j = i;
                        while (j > 0 && listPeminjaman20[j-1].denda < temp.denda) {
                            listPeminjaman20[j] = listPeminjaman20[j-1];
                            j--;
                        }
                        listPeminjaman20[j] = temp;
                    }

                    for (int i = 0; i < listPeminjaman20.length; i++) {
                        listPeminjaman20[i].tampilkanPeminjaman();
                    }
                    break;
                case 5:
                    for (int i = 0; i < listPeminjaman20.length; i++) {
                        Peminjaman20 temp = listPeminjaman20[i];
                        int j = i;
                        while (j > 0 && Integer.parseInt(listPeminjaman20[j-1].mahasiswa.nim )< Integer.parseInt(temp.mahasiswa.nim)) {
                            listPeminjaman20[j] = listPeminjaman20[j-1];
                            j--;
                        }
                        listPeminjaman20[j] = temp;
                    }
                    
                    System.out.print("Input NIM: ");
                    int y = sc.nextInt();

                    boolean found = false;

                    int Tengah;
                    int awal = 0;
                    int akhir = listPeminjaman20.length-1;

                    do {
                        Tengah = (awal+1+akhir) / 2;
                        if (Integer.parseInt(listPeminjaman20[Tengah].mahasiswa.nim) == y) {
                            listPeminjaman20[Tengah].tampilkanPeminjaman();;
                            found = true;
                        }
                        if (Integer.parseInt(listPeminjaman20[Tengah].mahasiswa.nim) > y) {
                            awal = Tengah + 1;
                        }else{
                            akhir = Tengah - 1;
                        }
                    } while (awal <= akhir);

                    if (!found) {
                        System.out.println("NIM TIDAK ADA");
                        System.out.println("");
                    }

                    break;
                case 6:
                    System.out.print("Input Kode Buku: ");
                    String z = sc.next();

                    boolean foundBook = false;

                    for (int i = 0; i < listBuku20.length; i++) {
                        if (listBuku20[i].kodeBuku.equalsIgnoreCase(z)) {
                            listBuku20[i].tampilBuku();
                            foundBook = true;
                        }
                    }

                    if (!foundBook) {
                        System.out.println("BUKU TIDAK ADA");
                        System.out.println("");
                    }
                    
                    break;
                default:
                    sc.close();
                    return;
                    
            }
        } while (true);
    }

    //     void SelectionSort(){
    //     for (int i = 0; i < listSiswa.length-1; i++) {
    //         int idxMin = i;
    //         for (int j = i+1; j < listSiswa.length; j++) {
    //             if (listSiswa[j].ipk > listSiswa[idxMin].ipk) {
    //                 idxMin = j;
    //             }
    //         }
    //         Mahasiswa20 temp = listSiswa[idxMin];
    //         listSiswa[idxMin] = listSiswa[i];
    //         listSiswa[i] = temp;
    //     }
    // }

    // void InsertionSort(){
    //     for (int i = 1; i < listSiswa.length; i++) {
    //         Mahasiswa20 temp = listSiswa[i];
    //         int j=i;
    //         while (j > 0 && listSiswa[j-1].ipk < temp.ipk) {
    //             listSiswa[j] = listSiswa[j-1];
    //             j--;
    //         }
    //         listSiswa[j] = temp;
    //     }
    // }

    // void BubbleSort(){
    //     for (int i = 0; i < listSiswa.length-1; i++) {
    //         for (int j = 1; j < listSiswa.length-i; j++) {
    //             if (listSiswa[j].ipk > listSiswa[j-1].ipk) {
    //                 Mahasiswa20 temp = listSiswa[j];
    //                 listSiswa[j] = listSiswa[j-1];
    //                 listSiswa[j-1] = temp;
    //             }
    //         }
    //     }
    // }
}

package CM1.CM1_Revisi;

import java.util.Scanner;

public class PeminjamanData20 {
    Scanner sc = new Scanner(System.in);

    static Mahasiswa20_1[] listSiswa = new Mahasiswa20_1[3];
    static Buku20_1[] listBuku20 = new Buku20_1[4];
    static Peminjaman20_1[] listPeminjaman20 = new Peminjaman20_1[5];

    public static void main(String[] args) {
        listSiswa[0] = new Mahasiswa20_1("22001", "Andi", "Teknik Informatika"); 
        listSiswa[1] = new Mahasiswa20_1("22002", "Budi", "Teknik Informatika"); 
        listSiswa[2] = new Mahasiswa20_1("22003", "Citra", "Sistem Informasi");

        listBuku20[0] = new Buku20_1("B001", "Algoritma", 2020);
        listBuku20[1] = new Buku20_1("B002", "Basis Data", 2019);
        listBuku20[2] = new Buku20_1("B003", "Pemrograman", 2021);
        listBuku20[3] = new Buku20_1("B004", "Fisika", 2024);

        listPeminjaman20[0] = new Peminjaman20_1(listSiswa[0], listBuku20[0], 7);
        listPeminjaman20[1] = new Peminjaman20_1(listSiswa[1], listBuku20[1], 3);
        listPeminjaman20[2] = new Peminjaman20_1(listSiswa[2], listBuku20[2], 10);
        listPeminjaman20[3] = new Peminjaman20_1(listSiswa[2], listBuku20[3], 6);
        listPeminjaman20[4] = new Peminjaman20_1(listSiswa[0], listBuku20[1], 4);
    }
    
    public PeminjamanData20(){

    }

    void tampilDataBuku(){
        main(null);
        for (int i = 0; i < listBuku20.length; i++) {
        listBuku20[i].tampilBuku();
        }
    }

    void tampilDataMahasiswa(){
        main(null);
        for (int i = 0; i < listSiswa.length; i++) {
            listSiswa[i].tampilMahasiswa();
        }
    }

    void tampilDataPeminjaman(){
        main(null);
        for (int i = 0; i < listPeminjaman20.length; i++) {
            listPeminjaman20[i].tampilkanPeminjaman();
        }
    }

    void InsertionSort(){
        main(null);
        for (int i = 0; i < listPeminjaman20.length; i++) {
        Peminjaman20_1 temp = listPeminjaman20[i];
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
    }

    void SelectionSearch(){
        main(null);
        for (int i = 0; i < listPeminjaman20.length; i++) {
            Peminjaman20_1 temp = listPeminjaman20[i];
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
            listPeminjaman20[Tengah].tampilkanPeminjaman();
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
    }
}

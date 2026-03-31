package Praktikum05;

public class MahasiswaBerprestasi20 {
    Mahasiswa20[] listSiswa = new Mahasiswa20[5];
    int idx;

    void Tambah(Mahasiswa20 m){
        if (idx < listSiswa.length) {
            listSiswa[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void Tampil(){
        for (Mahasiswa20 m : listSiswa) {
            m.TampilkanInformasi();
            System.out.println("------------------------");
        }
    }

    void BubbleSort(){
        for (int i = 0; i < listSiswa.length-1; i++) {
            for (int j = 1; j < listSiswa.length-i; j++) {
                if (listSiswa[j].ipk > listSiswa[j-1].ipk) {
                    Mahasiswa20 temp = listSiswa[j];
                    listSiswa[j] = listSiswa[j-1];
                    listSiswa[j-1] = temp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < listSiswa.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listSiswa.length; j++) {
                if (listSiswa[j].ipk > listSiswa[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa20 temp = listSiswa[idxMin];
            listSiswa[idxMin] = listSiswa[i];
            listSiswa[i] = temp;
        }
    }

    void InsertionSort(){
        for (int i = 1; i < listSiswa.length; i++) {
            Mahasiswa20 temp = listSiswa[i];
            int j=i;
            while (j > 0 && listSiswa[j-1].ipk < temp.ipk) {
                listSiswa[j] = listSiswa[j-1];
                j--;
            }
            listSiswa[j] = temp;
        }
    }
}

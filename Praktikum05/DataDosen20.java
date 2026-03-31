package Praktikum05;

public class DataDosen20 {
    Dosen20[] dataDosen20 = new Dosen20[10];
    int idx;

    void tambah(Dosen20 dosen){
        if (idx < dataDosen20.length) {
            dataDosen20[idx] = dosen;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        if (idx == 0) {
            System.out.println("Tidak ada data yang bisa ditampilkan");
        }else{
            for (int i = 0; i < idx; i++) {
                dataDosen20[i].tampil();
                System.out.println("----------------------------");
            }
        }
    }

    void SortingASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDosen20[j].usia < dataDosen20[j-1].usia) {
                    Dosen20 temp = dataDosen20[j];
                    dataDosen20[j] = dataDosen20[j-1];
                    dataDosen20[j-1] = temp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < idx-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < idx; j++) {
                if (dataDosen20[j].usia > dataDosen20[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen20 temp = dataDosen20[idxMin];
            dataDosen20[idxMin] = dataDosen20[i];
            dataDosen20[i] = temp;
        }
    }

    void InsertionSort(){
        for (int i = 1; i < idx; i++) {
            Dosen20 temp = dataDosen20[i];
            int j=i;
            while (j > 0 && dataDosen20[j-1].usia > temp.usia) {
                dataDosen20[j] = dataDosen20[j-1];
                j--;
            }
            dataDosen20[j] = temp;
        }
    }
}

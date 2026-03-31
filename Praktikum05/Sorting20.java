package Praktikum05;

public class Sorting20 {
    int[] data;
    int jumlahData;

    Sorting20(int[] Data, int jlhData){
        jumlahData = jlhData;
        data = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            data[i] = Data[i];
        }
    }

    void BubbleSort(){
        int sementara = 0;
        
        for (int i = 0; i < jumlahData-1; i++) {
            for (int j = 1; j < jumlahData-i; j++) {
                if (data[j - 1] > data[j]) {
                    sementara = data[j];
                    data[j] = data[j-1];
                    data[j-1] = sementara;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < jumlahData-1; i++) {
            int MinAwal = i;
            for (int j = i+1; j < jumlahData; j++) {
                if (data[j] < data[MinAwal]) {
                    MinAwal = j;
                }
            }
            int temp = data[i];
            data[i] = data[MinAwal];
            data[MinAwal] = temp;
        }
    }

    void InsertionSort(){
        for (int i = 1; i <= jumlahData-1; i++) {
            int temp = data[i];
            int j = i-1;
            while (j >= 0 && data[j] > temp) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }

    void Tampil(){
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

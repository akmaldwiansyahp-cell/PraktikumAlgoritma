package Praktikum05;

public class SortingMain20 {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 12};

        Sorting20 dataUrut1 = new Sorting20(a, a.length);
        System.out.println("Data Awal 1");
        dataUrut1.Tampil();
        dataUrut1.BubbleSort();
        System.out.println("Data Telah Diurutkan Dengan Bubble Sort (ASC)");
        dataUrut1.Tampil();
        System.out.println();

        int[] b = {30, 20, 2, 8, 14};

        Sorting20 dataUrut2 = new Sorting20(b, b.length);
        System.out.println("Data Awal 2");
        dataUrut2.Tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data Telah Diurutkan Dengan Selection Sort (ASC)");
        dataUrut2.Tampil();
        System.out.println();

        int[] c = {40, 10, 4, 9, 3};

        Sorting20 dataUrut3 = new Sorting20(c, c.length);
        System.out.println("Data Awal 3");
        dataUrut3.Tampil();
        dataUrut3.InsertionSort();
        System.out.println("Data Telah Diurutkan Dengan Insertion Sort (ASC)");
        dataUrut3.Tampil();
    }
}

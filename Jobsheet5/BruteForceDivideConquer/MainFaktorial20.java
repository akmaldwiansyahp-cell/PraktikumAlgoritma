package Jobsheet5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        Faktorial20 fk = new Faktorial20();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        sc.close();
    }
}

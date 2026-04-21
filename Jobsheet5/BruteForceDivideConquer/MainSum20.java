package Jobsheet5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = sc.nextInt();

        Sum20 sum = new Sum20(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan ke-" + (i+1) + ": ");
            sum.keuntungan[i] = sc.nextInt();
        }
        
        System.out.println("Total keuntungan menggunakan Brute Force: " + sum.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer: " + sum.totalDC(sum.keuntungan, 0, elemen-1));

        sc.close();
    }
    
}

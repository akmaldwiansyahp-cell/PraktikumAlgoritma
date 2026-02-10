package Jobsheet1;

import java.util.Scanner;

public class PemilihanNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Tugas, Kuis, UTS, UAS, P_Tugas, P_Kuis, P_UTS, P_UAS, Total;
        int Counter = 0;
        

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        Tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        Kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        UAS = sc.nextDouble();
        System.out.println("===============================");

        P_Tugas = Tugas * 0.2;
        P_Kuis = Kuis * 0.2;
        P_UTS = UTS * 0.3;
        P_UAS = UAS * 0.3; 

        Total = P_Tugas + P_Kuis + P_UTS + P_UAS;

        if (Tugas > 100 || Kuis > 100 || UTS > 100|| UAS > 100) {
            Counter++;
        }

        System.out.println("===============================");
        if (Counter == 1) {
            System.out.println("Nilai Tidak Valid");
        }else{
            System.out.println("Nilai Akhir: " + Total);
            if (80 < Total && Total <= 100) {
                System.out.println("Nilai Huruf: A");
            }else if (73 < Total) {
                System.out.println("Nilai Huruf: B+");
            }else if (65 <Total) {
                System.out.println("Nilai Huruf: B");
            }else if (60 < Total) {
                System.out.println("Nilai Huruf: C+");
            }else if (50 <Total) {
                System.out.println("Nilai Huruf: C");
            }else if (39 < Total) {
                System.out.println("Nilai Huruf: D");
            }else if (Total <= 39) {
                System.out.println("Nilai Huruf: E");
            }
        }
        System.out.println("===============================");
        System.out.println("===============================");
        if (!(Counter == 1)) {
            if (51 < Total && Total <=100) {
                System.out.println("SELAMAT ANDA LULUS");
                System.out.println("===============================");
            }else{
                System.out.println("SELAMAT ANDA TIDAK LULUS");
                System.out.println("===============================");
            }
        }
        

    }
}

package Jobsheet1;

import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //[8][1] Untuk MK dan [8][2] Untuk Nilai Huruf
        String[][] ArrayHuruf = new String[8][2];
        //[8][1] Untuk Nilai Angka, [8][2] Untuk Bobot SKS, [8][3] Untuk Nilai Setara
        double[][] ArrayAngka = new double[8][3];
        double[] TotalHitung = new double[8];

        double TotalIP = 0, TotalSKS = 0;
        System.out.println("===================");
        for (int i = 0; i < TotalHitung.length; i++) {
            System.out.print("Masukkan Mata Pelajaran ke-" + (i+1) + ": ");
            ArrayHuruf[i][0] = sc.nextLine();
            System.out.print("Input Bobot Nilai Mata Pelajaran: ");
            ArrayAngka[i][1] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("=================");

        for (int i = 0; i < TotalHitung.length; i++) {
            System.out.print("Masukkan Nilai " + ArrayHuruf[i][0] + ": ");
            while (true) {
                ArrayAngka[i][0] = sc.nextDouble();
                if (0 < ArrayAngka[i][0] && ArrayAngka[i][0] <= 100 ) {
                    break;
                }else{
                    System.out.println("Nilai Tidak Sesuai, Mohon Coba Kembali");
                    continue;
                }
            }
        }

        for (int i = 0; i < TotalHitung.length; i++) {
            if (80 < ArrayAngka[i][0] && ArrayAngka[i][0] <= 100) {
                ArrayHuruf[i][1] = "A";
                ArrayAngka[i][2] = 4;
            }else if (73 < ArrayAngka[i][0]) {
                ArrayHuruf[i][1] = "B+";
                ArrayAngka[i][2] = 3.5;
            }else if (65 < ArrayAngka[i][0]) {
                ArrayHuruf[i][1] = "B";
                ArrayAngka[i][2] = 3;
            }else if (60 < ArrayAngka[i][0]) {
                ArrayHuruf[i][1] = "C+";
                ArrayAngka[i][2] = 2.5;
            }else if (50 <ArrayAngka[i][0]) {
                ArrayHuruf[i][1] = "C";
                ArrayAngka[i][2] = 2;
            }else if (39 < ArrayAngka[i][0]) {
                ArrayHuruf[i][1] = "D";
                ArrayAngka[i][2] = 1;
            }else if (ArrayAngka[i][0] <= 39) {
                ArrayHuruf[i][1] = "E";
                ArrayAngka[i][2] = 0;
            }
        }

        for (int i = 0; i < TotalHitung.length; i++) {
            TotalHitung[i] = ArrayAngka[i][1] * ArrayAngka[i][2];
            TotalIP += TotalHitung[i];
            TotalSKS += ArrayAngka[i][1];
        }

        System.out.println("Nilai hasil konversi");
        System.out.println("=============");
        System.out.println("MATA KULIAH | NILAI ANGKA | NILAI HURUF | BOBOT NILAI");

        for(int i = 0; i < TotalHitung.length; i++){
            System.out.printf("| %-40s | %-10.2f | %-11s | %-11.2f |\n", 
                ArrayHuruf[i][0], ArrayAngka[i][0], ArrayHuruf[i][1], ArrayAngka[i][2]);
        }

        System.out.println("IP: " + (TotalIP / TotalSKS));
        
    }
}

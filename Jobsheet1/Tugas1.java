package Jobsheet1;

import java.util.Scanner;

public class Tugas1 {

    private static char[] Kode = {'A','B','D','E','F','G','H','L','N','T'};
    private static char[][] PlatNomor = {{'B','A','N','T','E','N'},
                                        {'J','A','K','A','R','T','A'},
                                        {'B','A','N','D','U','N','G'},
                                        {'C','I','R','E','B','O','N'},
                                        {'B','O','G','O','R'},
                                        {'P','E','K','A','L','O','N','G','A','N'},
                                        {'S','E','M','A','R','A','N','G'},
                                        {'S','U','R','A','B','A','Y','A'},
                                        {'M','A','L','A','N','G'},
                                        {'T','E','G','A','L'}};

    public static void main(String[] args) {
        SearchingPlat();
    }

    public static void SearchingPlat(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Kode Kota: ");
        char Mencari = sc.next().charAt(0);

        int counter = 0;

        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i] == Mencari) {
                counter = i;
            }
        }

        for (int i = 0; i < PlatNomor[counter].length; i++) {
           System.out.print(PlatNomor[counter][i]);
        }

    }
}

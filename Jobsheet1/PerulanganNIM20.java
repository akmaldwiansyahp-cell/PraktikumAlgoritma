package Jobsheet1;

import java.util.Scanner;

public class PerulanganNIM20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Nim, AngkaNim;

        System.out.print("Masukkan NIM Anda: ");
        Nim = sc.nextDouble();

        AngkaNim = Nim % 100;

        if (AngkaNim < 10) {
            AngkaNim += 10;
        }
        
        for (int i = 1; i <= AngkaNim; i++) {
            
            if(i == 10 || i == 15){
                continue;
            }else if (i % 3 == 0) {
                System.out.print("#");
            }else if (i % 2 == 1) {
                System.out.print("*");
            }else{
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}

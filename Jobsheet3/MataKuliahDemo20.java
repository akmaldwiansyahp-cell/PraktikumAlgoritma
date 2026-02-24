import java.util.Scanner;

public class MataKuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT JUMLAH MATA KULIAH: ");
        int a = sc.nextInt();
        MataKuliah20[] arrayOfMataKuliah20 = new MataKuliah20[a];

        for (int i = 0; i < arrayOfMataKuliah20.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke- " + (i+1));
            arrayOfMataKuliah20[i] = new MataKuliah20();
            arrayOfMataKuliah20[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah20.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah20[i].checkinfo();
        }

    }   
}

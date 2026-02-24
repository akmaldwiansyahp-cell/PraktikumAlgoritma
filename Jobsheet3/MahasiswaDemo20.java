import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa20[] arrayOfMahasiswa20 = new Mahasiswa20[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa20.length; i++) {
            arrayOfMahasiswa20[i] = new Mahasiswa20();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa20[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa20[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa20[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa20[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa20.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa20[i].checkinfo();
        }
        sc.close();
    }
}

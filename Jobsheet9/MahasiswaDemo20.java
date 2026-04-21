package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        int Pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");

            Pilih = sc.nextInt();
            sc.nextLine();

            switch (Pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa20 siswa = new Mahasiswa20(nim, nama, kelas);
                    stack.push(siswa);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", siswa.nama);
                    break;
                case 2:
                    Mahasiswa20 dinilai = stack.Pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa20 lihat = stack.Peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.Print();
                    break;
                case 5:
                    Mahasiswa20 lihat2 = stack.low();
                    if (lihat2 != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat2.nama);
                    }
                    break;
                case 6:
                    stack.jumlah();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (Pilih >= 1 && Pilih <= 6);

        sc.close();
    }
}

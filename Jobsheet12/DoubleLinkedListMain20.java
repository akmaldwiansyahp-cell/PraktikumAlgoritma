package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain20 {
    static Mahasiswa20 inputMahasiswa20(Scanner scan){
        System.out.print("NIM : ");
        String nim = scan.nextLine(); 
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa20(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList20 list = new DoubleLinkedList20();
        int pilih;

        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah data diawal");
            System.out.println("2. Tambah data diakhir");
            System.out.println("3. Sisipkan data setelah NIM");
            System.out.println("4. Hapus data diawal");
            System.out.println("5. Hapus data diakhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa20 mhsAwal = inputMahasiswa20(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa20 mhsAkhir = inputMahasiswa20(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNIM = sc.nextLine();
                    System.out.println("Input data Mahasiswa: ");
                    Mahasiswa20 mhsTengah = inputMahasiswa20(sc);
                    list.insertAfter(keyNIM, mhsTengah);
                    break;
                case 4: 
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program Berhenti");
                    break;
                default:
                    System.out.println("Input Tidak Valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}

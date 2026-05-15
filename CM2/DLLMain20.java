package CM2;

import java.util.Scanner;

public class DLLMain20 {
    static Pembeli20 Pembeli(Scanner sc){
        System.out.print("Nama           : ");
        String nama = sc.nextLine();
        System.out.print("Nomor Handphone: ");
        String noHp = sc.nextLine();

        return new Pembeli20(nama, noHp);
    }

    static Pesanan20 Pesanan(Scanner sc){
        System.out.print("Kode pesanan: ");
        int kode = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama pesanan: ");
        String nama = sc.nextLine();
        System.out.print("Harga: ");
        int harga = sc.nextInt();
        sc.nextLine();

        return new Pesanan20(kode, nama, harga);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian20 antrian = new DLLAntrian20();
        int pilih;

        Pembeli20 pembeli1 = new Pembeli20("Ainra", "08224500000");
        Pembeli20 pembeli2 = new Pembeli20("Danra", "08224511111");
        Pembeli20 pembeli3 = new Pembeli20("Sanri", "08224522222");   
        
        antrian.addLast(pembeli1);
        antrian.addLast(pembeli2);
        antrian.addLast(pembeli3);

        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah data");
            System.out.println("2. Cetak antrian");
            System.out.println("3. Hapus antrian dan pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    Pembeli20 pembeli = Pembeli(sc);
                    antrian.addLast(pembeli);
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    Pesanan20 pesanan = Pesanan(sc);
                    antrian.removeFirst(pesanan);
                    break;
                case 4:
                    antrian.printPesanan();
                    break;
                default:
                    break;
            }
            
        } while (pilih != 0);
        sc.close();
    }
}

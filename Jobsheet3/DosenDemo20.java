import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT JUMLAH DATA DOSEN: ");
        int a = sc.nextInt();
        sc.nextLine();

        Dosen20[] arrayOfDosen20 = new Dosen20[a];
        String kode, nama, dummy;
        int usia;
        boolean jenisKelamin = false;

        for (int i = 0; i < arrayOfDosen20.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            while(true){
                System.out.print("Jenis Kelamin: ");
                dummy = sc.nextLine();
                if(dummy.equalsIgnoreCase("Pria")){
                    jenisKelamin = true;
                    break;
                }else if(dummy.equalsIgnoreCase("Wanita")){
                    jenisKelamin = false;
                    break;
                }else{
                    System.out.println("Ulangi kembali");
                    continue;
                }
            }
            System.out.print("Usia         : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");

            arrayOfDosen20[i] = new Dosen20(kode, nama, jenisKelamin, usia);
        }

        DataDosen20 data = new DataDosen20();
        
        while(true){
                System.out.println("\n==============================");
                System.out.println("        MENU DATA DOSEN       ");
                System.out.println("==============================");
                System.out.println("1. Tampilkan Semua Data Dosen");
                System.out.println("2. Jumlah Dosen per Jenis Kelamin");
                System.out.println("3. Rata-rata Usia per Jenis Kelamin");
                System.out.println("4. Informasi Dosen Paling Tua");
                System.out.println("5. Informasi Dosen Paling Muda");
                System.out.println("6. Keluar");
                System.out.println("==============================");
                System.out.print("Pilih Angka Menu yang ingin dituju: ");
                System.out.print("Pilih Angka Menu yang ingin ditujui: ");
            int b = sc.nextInt();
            switch (b) {
                case 1:data.dataSemuaDosen(arrayOfDosen20); break;
                case 2:data.jumlahDosenPerJenisKelamin(arrayOfDosen20); break;
                case 3:data.rataUsiaDosenPerJenisKelamin(arrayOfDosen20);break;
                case 4:data.infoDosenPalingTua(arrayOfDosen20); break;
                case 5:data.infoDosenPalingMuda(arrayOfDosen20);break;
                case 6:System.out.println("Program selesai.");return; 
                default:System.out.println("Menu tidak valid.");
            }

        }
    }
}

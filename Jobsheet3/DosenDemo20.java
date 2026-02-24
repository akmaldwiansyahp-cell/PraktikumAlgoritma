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
        data.dataSemuaDosen(arrayOfDosen20);
    }
}

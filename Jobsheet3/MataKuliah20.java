import java.util.Scanner;

public class MataKuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlah;
    public String dummy;

    public MataKuliah20(){

    }

    public MataKuliah20(String kode, String nama, int sks, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlah = jumlah;
    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode      : ");
        kode = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("SKS       : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah jam: ");
        dummy = sc.nextLine();
        jumlah = Integer.parseInt(dummy);
        System.out.println("---------------------------");
        
    }

    void checkinfo(){
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("SKS           : " + sks);
        System.out.println("Jumlah jam    : " + jumlah);
    }
    
}

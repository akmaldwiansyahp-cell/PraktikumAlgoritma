package Jobsheet11;

// import java.util.Scanner;

public class SLLMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20("01", "Akmal", "1G", 3.6);
        Mahasiswa20 mhs2 = new Mahasiswa20("02", "Rofiq", "1G", 4.0);
        Mahasiswa20 mhs3 = new Mahasiswa20("03", "Yudhis", "1G", 3.8);
        Mahasiswa20 mhs4 = new Mahasiswa20("04", "Fauzi", "1G", 3.7);

        SingleLinkedList20 sll = new SingleLinkedList20();

        sll.print();
        sll.addFirt(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Fauzi", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index: 1: ");
        sll.getData(1);

        System.out.println("data Mahasiswa Rofiq terdapat index " + sll.indexOf("Rofiq"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        

        // Scanner sc = new Scanner(System.in);

        // Mahasiswa20[] siswa = new Mahasiswa20[4];

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Input data Mahasiswa ke-" + (i+1) + " :");
        //     System.out.print("NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas: ");
        //     String Kelas = sc.nextLine();
        //     System.out.print("IPK: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();

        //     siswa[i] = new Mahasiswa20(nim, nama, Kelas, ipk);
        // }

        // SingleLinkedList20 sll = new SingleLinkedList20();

        // sll.print();
        // sll.addFirt(siswa[3]);
        // sll.print();
        // sll.addLast(siswa[0]);
        // sll.print();
        // sll.insertAfter("Fauzi", siswa[2]);
        // sll.insertAt(2, siswa[1]);
        // sll.print();

        // sc.close();
    }
}

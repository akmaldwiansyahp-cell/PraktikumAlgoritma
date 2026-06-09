package Jobsheet14;

public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();
        Mahasiswa20 mhs1 = new Mahasiswa20("2201011001", "Andi", "TI-1A", 3.95);
        Mahasiswa20 mhs2 = new Mahasiswa20("2201012002", "Budi", "TI-1A", 3.21);
        Mahasiswa20 mhs3 = new Mahasiswa20("2201011003", "Sinta", "TI-1B", 3.82);
        Mahasiswa20 mhs4 = new Mahasiswa20("2201012004", "Rina", "TI-1B", 3.45);
        
        Mahasiswa20 mhs5 = new Mahasiswa20("2201011005", "Dimas", "TI-1C", 2.75);
        Mahasiswa20 mhs6 = new Mahasiswa20("2201012006", "Fajar", "TI-1C", 3.10);
        Mahasiswa20 mhs7 = new Mahasiswa20("2201011007", "Nabila", "TI-1D", 3.76);     
        Mahasiswa20 mhs8 = new Mahasiswa20("2201011008", "Rizki", "TI-1D", 3.50);
        Mahasiswa20 mhs9 = new Mahasiswa20("2201011009", "Aulia", "TI-1E", 3.88);
        Mahasiswa20 mhs10 = new Mahasiswa20("2201011010", "Kevin", "TI-1E", 3.00);
        
        Mahasiswa20[] dataMahasiswa = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,mhs8, mhs9, mhs10};
        int idxLast = 9;
        bta.populateData(dataMahasiswa, idxLast);
        
        // bta.traverseInOrder(0);

        // System.out.println("\nPreOrder Traversal Mahasiswa: ");
        // bta.traversePreOrder(0);

        // System.out.println("\nInorder transfers");
        // bta.traverseInOrder(0);

        System.out.println("\nMencari nama");
        bta.searchByName(0, "Nabila");

        System.out.println("\nMencari berdasarkan kelas");
        bta.searchByClass(0, "TI-1B");

        System.out.println("\nMencari 3 IPK tertinggi");
        bta.ipkTertinggi(0,0);
    }
}

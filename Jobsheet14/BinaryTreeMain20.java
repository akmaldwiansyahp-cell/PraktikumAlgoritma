package Jobsheet14;

public class BinaryTreeMain20 {
    public static void main(String[] args) {
        BinaryTree20 bst = new BinaryTree20();

        bst.addRekursif(new Mahasiswa20("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa20("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa20("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa20("244160220", "Dewi", "B", 3.54));

        bst.cariMaxIPK();

        System.out.println("\nDaftar semua Mahasiswa (In Order Traverse): ");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nPencarian data Mahasiswa");
        System.out.print("Cari mahasiswa dengan IPK: 3.54 -> ");
        String hasilCari = bst.found(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK: 3.22 -> ");
        hasilCari = bst.found(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa20("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa20("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa20("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua Mahasiswa");
        System.out.println("\nInOrder Traversal");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data");
        bst.delete(3.57);
        System.out.println("\nDaftar semua Mahasiswa");
        bst.traverseInOrder(bst.root);

        bst.cariMaxIPK();
        bst.cariMinIPK();

        System.out.println("\nipk di atas");

        bst.tampilMahasiswaIPKDiAtas(bst.root, 3.50);
    }
}

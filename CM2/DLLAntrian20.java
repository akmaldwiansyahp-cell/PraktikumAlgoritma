package CM2;

public class DLLAntrian20 {
    NodePembeli20 headPembeli;
    NodePembeli20 tailPembeli;

    NodePesanan20 headPesanan;
    NodePesanan20 tailPesanan;

    int counter;

    DLLAntrian20(){
        headPembeli = null;
        tailPembeli = null;

        headPesanan = null;
        tailPesanan = null;

        counter = 0;
    }

    boolean isEmpty(){
        return headPembeli == null;
    }

    void addLast(Pembeli20 data){
        NodePembeli20 newNode = new NodePembeli20(data);
        counter++;
        newNode.data.noAntrian = counter;
        if (isEmpty()) {
            headPembeli = tailPembeli = newNode;
        }else{
            tailPembeli.next = newNode;
            newNode.prev = tailPembeli;
            tailPembeli = newNode;
        }
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %s%n", "No Antrian", "Nama", "No HP");

        NodePembeli20 current = headPembeli;
        while (current != null) {
            System.out.println();
            current.data.tampil();
            current = current.next;
        }
    }
    
    void removeFirst(Pesanan20 data){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        NodePesanan20 newNode = new NodePesanan20(data);
        NodePembeli20 namaPembeli = headPembeli;

        if (headPembeli == tailPembeli) {
            headPembeli = tailPembeli = null;
        }else{
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }
        
        if (headPesanan == null) {
            headPesanan = tailPesanan = newNode;
        }else{
            tailPesanan.next = newNode;
            newNode.prev = tailPesanan;
            tailPesanan = newNode;
        }

        System.out.println(namaPembeli.data.nama + " telah memesan " + newNode.data.namaPesanan);
    }
    
    void printPesanan(){
        if (headPesanan == null) {
            System.out.println("Linked list masih kosong");
            return;
        }       

       boolean swapped;
        do {
            swapped = false;
            NodePesanan20 current = headPesanan;
            while (current.next != null) {
                int comparison = current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan);
                if (comparison > 0) {
                    Pesanan20 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;                
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga"); 

        NodePesanan20 current = headPesanan;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }    
}

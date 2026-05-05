package Jobsheet11.Tugas;

public class LinkedListAntrian20 {
    Node20 head;
    Node20 tail;
    int size;
    int max = 5;

    boolean isFull(){
       if (size == max) {
            return true;
       }else{
            return false;
       }
    }

    boolean isEmpty(){
        return(head == null);
    }

    void print(){
        if (!isEmpty()) {
            Node20 temp = head;
            System.out.println("Isi Linked List:\t");
            while (temp != null) {
                temp.data.TampilInformasi();
                temp = temp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    void TambahAntrian(Mahasiswa20 input){
        if (isFull()) {
            System.out.println("Antrian sudah full");
        }else{
            Node20 in = new Node20(input, null);
            if (isEmpty()) {
                head = in;
                tail = in;
                size++;
            }else{
                tail.next = in;
                tail = in;
                size++;
            }
        }
    }

    void Pemanggilan(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else if (head == tail) {
            head = tail = null; 
            size--;
        }else{
            head = head.next;
            size--;
        }
    }

    void CekKosong(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            System.out.println("Terdapat Antrian");
        }
    }

    void CekPenuh(){
        if (isFull()) {
            System.out.println("Antrian penuh");
        }else{
            if (isEmpty()) {
            System.out.println("Antrian kosong");
            }else{
            System.out.println("Terdapat Antrian");
            }
        }
    }

    void KosongAntrian(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else{
            size = 0;
            head = tail = null;
        }
    }

    void Terdepan(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else{
            Node20 temp = head;
            temp.data.TampilInformasi();
        }
    }

    void Terbelakang(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else{
            Node20 temp = tail;
            temp.data.TampilInformasi();
        }
    }

    int getJumlahAntrian(){
        return size;
    }
}

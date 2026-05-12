package Jobsheet12;

public class DoubleLinkedList20 {
    Node20 head;
    Node20 tail;

    DoubleLinkedList20(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(Mahasiswa20 data){
        Node20 newNode = new Node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa20 data){
        Node20 newNode = new Node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void add(Mahasiswa20 data, int index){

    }

    void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Node20 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Node20 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
            head.prev.data.tampil();
            head.prev = null;
        }
    }

    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        if (head == tail) {
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next.data.tampil();
            tail.next = null;
        }
    }

    void insertAfter(String keyNIM, Mahasiswa20 data){
        Node20 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan!");
            return;
        }

        Node20 newNode = new Node20(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else{
            newNode.prev = current;
            newNode.next = current.next;
            newNode.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNIM);
    }
}

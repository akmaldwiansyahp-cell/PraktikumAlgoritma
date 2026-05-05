package Jobsheet11;

public class SingleLinkedList20 {
    Node20 head;
    Node20 tail;

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

    void addFirt(Mahasiswa20 input){
        Node20 in = new Node20(input, null);
        if (isEmpty()) {
            head = in;
            tail = in;
        }else{
            in.next = head;
            head = in;
        }
    }

    void addLast(Mahasiswa20 input){
        Node20 in = new Node20(input, null);
        if (isEmpty()) {
            head = in;
            tail = in;
        }else{
            tail.next = in;
            tail = in;
        }
    }

    void insertAfter(String key, Mahasiswa20 input){
        Node20 in = new Node20(input, null);
        Node20 temp = head;

        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                in.next = temp.next;
                temp.next = in;
                if (in.next == null) {
                    tail = in;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa20 input){
        if (index < 0) {
            System.out.println("Index salah");
        }else if (index == 0) {
            addFirt(input);
        }else{
            Node20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node20(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    void getData(int index){
        Node20 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.TampilInformasi();
    }

    int indexOf(String key){
        Node20 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return -1;
        }else{
            return index;
        }
    }

    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else if (head == tail) {
            head = tail = null; 
        }else{
            head = head.next;
        }
    }

    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else{
            Node20 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(String key){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yang dapat dihapus!");
        }else{
            Node20 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                }else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index){
        if (index == 0) {
            removeFirst();
        }else{
            Node20 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

package Jobsheet9;

public class StackTugasMahasiswa20 {
    Mahasiswa20[] stack;
    int size;
    int top;

    StackTugasMahasiswa20(int size){
        this.size = size;
        stack = new Mahasiswa20[size];
        top = -1;
    }

    boolean isfull(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    void push(Mahasiswa20 siswa){
        if (!isfull()) {
            top++;
            stack[top] = siswa;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    Mahasiswa20 Pop(){
        if (!isEmpty()) {
            Mahasiswa20 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    Mahasiswa20 Peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugass untuk dinilai");
            return null;
        }
    }

    Mahasiswa20 low(){
        if (!isEmpty()) {
            return stack[0];
        }else{
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    void jumlah(){
        if (top != -1) {
            System.out.printf("Terdapat sebanyak %s data tugas Mahasiswa", (top+1));
        }else{
            System.out.println("Tidak terdapat tugas untuk dinilai");
        }
        System.out.println("");
    }

    void Print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalKeBiner(int nilai){
        StackKonversi20 stack = new StackKonversi20();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}

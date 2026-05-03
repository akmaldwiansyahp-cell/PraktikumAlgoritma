package Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    AntrianLayanan(int max){
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    void TambahAntrian(Mahasiswa siswa){
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan Mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = siswa; 
        size++;
        System.out.println(siswa.nama + " berhasil ditambahkan");
    }

    Mahasiswa LayananMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa siswa = data[front];
        front = (front + 1) % max;
        size--;
        return siswa;
    }

    void LihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        }else{
            System.out.print("Mahasiswa Terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].TampilkanData();
        }
    }

    void LihatTerbelakang(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            System.out.print("Mahasiswa Terbelakang: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[rear].TampilkanData();
        }
    }

    void TampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].TampilkanData();
        }
    }

    int GetJumlahAntrian(){
        return size;
    }
}

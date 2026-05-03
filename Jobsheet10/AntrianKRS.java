package Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses;
    int jumlahSisa;

    AntrianKRS(){
        max = 10;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahProses = 0;
        jumlahSisa = 30;
    }

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

    void CekKosong(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            System.out.println("Terdapat Antrian");
        }
    }

    void CekPenuh(){
        if (IsFull()) {
            System.out.println("Antrian penuh");
        }else{
            if (IsEmpty()) {
            System.out.println("Antrian kosong");
            }else{
            System.out.println("Terdapat Antrian");
            }
        }
    }

    void ClearAntrian(){
        if (!IsEmpty()) {
            jumlahSisa += size;
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else{
            System.out.println("Antrian masih kosong");
        }
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

    void ProsesKRS(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        if (size == 1) {
          System.out.println("Harus terdapat lebih dari 1 data");
          return;  
        }else{
        System.out.print("Melayani Mahasiswa: ");   
            for (int i = 0; i < 2; i++) {
                Mahasiswa siswa = data[front];
                front = (front + 1) % max;
                jumlahProses++;
                jumlahSisa--;
                size--;
                siswa.TampilkanData();
            }
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

    void LihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].TampilkanData();
            if (size > 1) {
                front = (front + 1) % max;
                data[front].TampilkanData();
            }
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
    
    int GetJumlahAntrian(){
        return size;
    }

    int GetJumlahProses(){
        return jumlahProses;
    }

    int GetJumlahSisa(){
        return jumlahSisa;
    }
}

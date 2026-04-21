package Jobsheet6;

public class MahasiswaBerprestasi20 {
    Mahasiswa20[] listSiswa = new Mahasiswa20[5];
    int idx;

    void Tambah(Mahasiswa20 m){
        if (idx < listSiswa.length) {
            listSiswa[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void Tampil(){
        for (Mahasiswa20 m : listSiswa) {
            m.TampilkanInformasi();
            System.out.println("------------------------");
        }
    }

    int SequentialSearch(double cari){
        int posisi = -1;
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data Mahasiswa dengan ipk " + x + " ditemukan pada index ke-" + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            listSiswa[pos].TampilkanInformasi();
        }else{
            System.out.println("Data Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (left <= right) {
            mid = (left+right)/2;
            if (cari == listSiswa[mid].ipk) {
                return (mid);
            }else if (listSiswa[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}

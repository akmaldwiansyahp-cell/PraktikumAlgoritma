package Jobsheet5.BruteForceDivideConquer;

public class Mahasiswa {
    String nama;
    String nim;
    int tahun;
    double uts;
    double uas;

    Mahasiswa(String nama, String nim, int tahun, double uts, double uas){
        this.nama = nama;
        this.nim = nim;
        this.tahun = tahun;
        this.uts = uts;
        this.uas = uas;
    }

    double MaxUTS(Mahasiswa[] arr, int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l+r)/2;
        double lmax = MaxUTS(arr, l, mid);
        double rmax = MaxUTS(arr, mid+1, r);
        return Math.max(lmax, rmax);
    }

    double MinUTS(Mahasiswa[] arr, int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l+r)/2;
        double lmin = MinUTS(arr, l, mid);
        double rmin = MinUTS(arr, mid+1, r);
        return Math.min(lmin, rmin);
    }

    Mahasiswa(){

    }

    double rataUAS(Mahasiswa[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}

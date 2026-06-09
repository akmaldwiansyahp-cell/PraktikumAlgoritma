package Jobsheet14;

public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;
    int id;

    BinaryTreeArray20(){
        dataMahasiswa = new Mahasiswa20[10];
    }

    void populateData(Mahasiswa20[] data, int idxLast){
        dataMahasiswa = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void add(Mahasiswa20 mahasiswa20){
        if (id < dataMahasiswa.length) {
            id++;
            dataMahasiswa[id] = mahasiswa20;
        }
    }

    void traversePreOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+1);
                traverseInOrder(2*idxStart+2);
            }
        }        
    }

        void searchByName(int idxStart, String nama){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                searchByName(2*idxStart+1, nama);
                // dataMahasiswa[idxStart].tampilInformasi();
                if (nama.equalsIgnoreCase(dataMahasiswa[idxStart].nama)) {
                    dataMahasiswa[idxStart].tampilInformasi();
                    return;
                }
                searchByName(2*idxStart+2, nama);
            }
        }
    }

        void searchByClass(int idxStart, String kelas){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                searchByClass(2*idxStart+1, kelas);
                // dataMahasiswa[idxStart].tampilInformasi();
                if (kelas.equalsIgnoreCase(dataMahasiswa[idxStart].kelas)) {
                    dataMahasiswa[idxStart].tampilInformasi();
                    return;
                }
                searchByClass(2*idxStart+2, kelas);
            }
        }
    }

    void ipkTertinggi(int idxStart, double awal){
        double tertinggi = awal;
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                if (dataMahasiswa[idxStart].ipk > tertinggi) {
                    tertinggi = dataMahasiswa[idxStart].ipk;
                    dataMahasiswa[idxStart].tampilInformasi();
                    ipkTertinggi(2*idxStart + 2, tertinggi);  
                }else if (dataMahasiswa[idxStart].ipk < tertinggi) {
                    dataMahasiswa[idxStart].tampilInformasi();
                    ipkTertinggi(2*idxStart+ 2, tertinggi);
                }
            }
        }        
    }    
}


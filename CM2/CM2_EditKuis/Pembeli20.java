package CM2.CM2_EditKuis;

public class Pembeli20 {
    int noAntrian;
    String nama;
    String nohp;

    Pembeli20(String nama, String hp){
        this.nama = nama;
        nohp = hp;
    }

    void tampil(){
        System.out.println(noAntrian + "\t\t" +nama + "\t\t" + nohp);
    }    
}

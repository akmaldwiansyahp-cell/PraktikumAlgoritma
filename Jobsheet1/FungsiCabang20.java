package Jobsheet1;

public class FungsiCabang20 {

    private static double[][] Stock = {{10, 5, 15, 7},
                                        {6, 11, 9, 12},
                                        {2, 10, 10, 5},
                                        {5, 7, 12, 9}};
    private static double[] Harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        MenghitungHarga();
        Status();
    }

    public static void MenghitungHarga(){

        System.out.println("=== PENDAPATAN SETIAL CABANG ===");

        int[] Total = new int[4];
        for (int i = 0; i < Stock.length; i++) {
            for (int j = 0; j < Stock[i].length; j++) {
                Total[i] += Stock[i][j] * Harga[j];
            }
        }

        for (int i = 0; i < Total.length; i++) {
            System.out.println("Royal Garden " + (i+1) + ": Rp. " + Total[i]);
        }
        System.out.println("===================================");
        System.out.println("");
    }

    private static void Status(){
        System.out.println("=== STATUS EVALUASI ===");

        int[] Total = new int[4];
        for (int i = 0; i < Stock.length; i++) {
            for (int j = 0; j < Stock[i].length; j++) {
                Total[i] += Stock[i][j] * Harga[j];
            }
        }

        for (int i = 0; i < Total.length; i++) {
            if (Total[i] > 1500000 && Total[i] <= 1500000) {
                System.out.println("Royal Garden " + (i+1) + ": Rp. " + Total[i] + " | Status: Sangat Baik");
            }else{
                System.out.println("Royal Garden " + (i+1) + ": Rp. " + Total[i] + " | Status: Perlu Evaluasi");
            }
        }
        System.out.println("===================================");
    }
}

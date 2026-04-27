//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026
public class Poin1Coecion {
    public static void main(String[] args) {
        
        int nilaiInteger = 65;
        char nilaiKarakter = (char) nilaiInteger;
        double nilaiReal = nilaiInteger;
        String nilaiString = Integer.toString(nilaiInteger);

        System.out.println("a. konversi nilai 65:");
        System.out.println("Integer  : " + nilaiInteger);
        System.out.println("Karakter : " + nilaiKarakter);
        System.out.println("Double   : " + nilaiReal);
        System.out.println("String   : " + nilaiString);

        int bilanganAwal = 65;
        double bilanganReal = bilanganAwal;
        int bilanganKembali = (int) bilanganReal;

        System.out.println( "\nb. Integer -> Real -> Integer");
        System.out.println("Bilangan Awal : " + bilanganAwal);
        System.out.println("Bilangan Real : " + bilanganReal);
        System.out.println("Bilangan Kembali : " + bilanganKembali);

        String x = "1234";
        String y = "5678";
        String S = x + y;
        int Z = Integer.parseInt(x) + Integer.parseInt(y);

        System.out.println("\nc. Operasi String X dan Y");
        System.out.println("S (concat) : " + S);
        System.out.println("Z (jumlah) : " + Z);

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("\nd. Operasi String P dan Q (double)");
        System.out.println("R (concat) : " + R);
        System.out.println("D (jumlah) : " + D);

        Integer A = Integer.parseInt(S);

        System.out.println("\ne. Konversi S ke Integer");
        System.out.println("A : " + A);
    }

}
/*Nama File : Titik.java
 *Deskripsi : Kelas yang berisi atribut dan method untuk titik
 *Pembuat   : Novelya Cherina 24060124140174
 *Tanggal   : 24 februari 2026
 */

 public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        
    }
}

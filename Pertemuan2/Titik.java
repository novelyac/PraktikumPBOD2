/*Nama File : Titik.java
 *Deskripsi : Kelas yang berisi atribut dan method untuk titik
 *Pembuat   : Novelya Cherina 24060124140174
 *Tanggal   : 24 februari 2026*/


public class Titik {
    /****************ATRIBUT*************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /****************METHOD**************/
    //kontstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    //konstruktor untuk membuat dengan nilai absis dan ordinat 0
    Titik() {
        this(0,0);
    }
    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //memngembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengeset absis titik dengan nilai baru x 
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik t) {
        double dx = this.absis - t.absis;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
    return new Titik(this.absis, -this.ordinat);
}

    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

} //end of class Titik


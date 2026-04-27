package LatihanPertemuan7;
//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026

class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomor() {
        return "-"; // akan dioverride
    }
}

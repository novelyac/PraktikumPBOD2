package LatihanPertemuan7;
//nama : Novelya Cherina
//NIM : 24060124140174  
//Lab : D2
//Tanggal : 21 April 2026
class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}

public class MataKuliah {
    /*******ATRIBUT*********/
    private String idMatkul;
    private String nama;
    private int sks;

    MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    MataKuliah() {
        idMatkul = "000000";
        nama = "---------";
        sks = 0;
    }
    public String getIdMatkul() {
        return idMatkul;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
}
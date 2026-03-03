/*Nama = Novelya Cherina
NIM = 24060124140174
Lab = D2 */
public class Dosen {

    /*******ATRIBUT*********/
    private String NIP;
    private String nama;
    private String prodi;
    
    /*******Method*********/
    Dosen(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }
    Dosen(){
        NIP = "0000000000";
        nama = "---------";
        prodi = "---------";
    }
    public String getNama() {
        return nama;
    }
    public String getNIP() {
        return NIP;
    }
    public String getProdi() {
        return prodi;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}

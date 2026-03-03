import java.util.ArrayList;
public class Mahasiswa {
    /*******ATRIBUT*********/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*******Method*********/
    //konstruktor untuk membuat mahasiswa tanpa parameter
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " dengan no plat " + kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
    public Mahasiswa() {
        nim = "0";
        nama = "-";
        prodi = "-";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }
    Mahasiswa(String nim, String nama, String prodi, Dosen doswal, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); //inisialisasi list kosong
        this.dosenWali = doswal; //inisialisasi dosen wali
        this.kendaraan = kendaraan; 
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public Dosen getDosenWali() {
        return dosenWali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    void setNim(String nim) {
        this.nim = nim;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setProdi(String prodi) {
        this.prodi = prodi;
    }


}
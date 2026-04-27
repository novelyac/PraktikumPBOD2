//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026

class Mahasiswa {
    private int NIM;
    private String Nama;
    private String ProgramStudi;

    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(int NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    public Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    public int getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // a. overloading setProgramStudi
    // tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // 1 parameter String
    public void setProgramStudi(String ps) {
        this.ProgramStudi = ps;
    }

    // 1 parameter objek Mahasiswa
    public void setProgramStudi(Mahasiswa mhs) {
        this.ProgramStudi = mhs.ProgramStudi;
    }

    // method tampil
    public void tampilData() {
        System.out.println("NIM           : " + NIM);
        System.out.println("Nama          : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
        System.out.println("----------------------------");
    }
}

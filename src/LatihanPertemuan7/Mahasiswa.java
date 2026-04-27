package LatihanPertemuan7;


class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.dosenWali = null;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM  : " + NIM);
        System.out.println("Nama : " + Nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali : -");
        }
        System.out.println("------------------------");
    }
}


// b. Kelas Seminar
class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    // c. count peserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // d. registrasi
    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // g. tampil peserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
        System.out.println("------------------------");
    }

    // h. count mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}


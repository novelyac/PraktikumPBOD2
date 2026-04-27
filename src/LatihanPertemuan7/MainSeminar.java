package LatihanPertemuan7;
//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026
public class MainSeminar {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        Mahasiswa m1 = new Mahasiswa("Andi", "M001");
        Mahasiswa m2 = new Mahasiswa("Budi", "M002");
        Mahasiswa m3 = new Mahasiswa("Citra", "M003");
        Mahasiswa m4 = new Mahasiswa("Dina", "M004");
        Mahasiswa m5 = new Mahasiswa("Eka", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Jumlah peserta: " + s.countPeserta());

        s.tampilPeserta();

        System.out.println("Jumlah mahasiswa: " + s.countMahasiswa());

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
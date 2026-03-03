
public class MMahasiswa{
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("MK001", "PBO", 3);
        MataKuliah MBD = new MataKuliah("MK002", "MBD", 3);
        Mahasiswa M1 = new Mahasiswa();
        Kendaraan K1 = new Kendaraan("B 1234 ABC", "Mobil");
        Dosen D1 = new Dosen("D001", "Dr. Andi", "Informatika");
        M1.setNim("24060124140174");
        M1.setNama("Novelya Cherina");
        M1.setProdi("Informatika");
        M1.getDosenWali().setNIP(D1.getNIP());
        M1.getDosenWali().setNama(D1.getNama());
        M1.getKendaraan().setNoPlat(K1.getNoPlat());
        M1.getKendaraan().setJenis(K1.getJenis());
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
    }
}
//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026
public class MainMahasiswa {
    public static void main(String[] args) {

        // b + c: constructor default
        System.out.println("Constructor tanpa parameter:");
        Mahasiswa m1 = new Mahasiswa();
        m1.tampilData();

        // d: constructor 3 parameter
        System.out.println("Constructor dengan parameter:");
        Mahasiswa m2 = new Mahasiswa(24060124, "Vela", "Informatika");
        m2.tampilData();

        // a + b: setProgramStudi tanpa parameter
        System.out.println("Set Program Studi (tanpa parameter):");
        m2.setProgramStudi();
        m2.tampilData();

        // a + b: setProgramStudi dengan String
        System.out.println("Set Program Studi (String):");
        m2.setProgramStudi("Sistem Informasi");
        m2.tampilData();

        // a + b: setProgramStudi dengan objek
        System.out.println("Set Program Studi (objek):");
        Mahasiswa m3 = new Mahasiswa(24060125, "Rina", "Teknik Komputer");
        m2.setProgramStudi(m3);
        m2.tampilData();

        // e: constructor cloning
        System.out.println("Constructor cloning:");
        Mahasiswa m4 = new Mahasiswa(m3);
        m4.tampilData();
    }
}
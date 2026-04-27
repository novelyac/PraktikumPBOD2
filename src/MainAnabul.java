public class MainAnabul {
    public static void main(String[] args) {

        // buat objek
        Anjing anjing = new Anjing("Milo", "Guk Guk", "Berjalan");
        Burung burung = new Burung("Pierre", "Cuit Cuit", "Terbang");
        Kucing kucing = new Kucing("Mochi", "Meong", "Berjalan");

        // tampil suara
        System.out.println("=== SUARA ===");
        anjing.Suara();
        burung.Suara();
        kucing.Suara();

        // tampil gerak
        System.out.println("\n=== GERAK ===");
        anjing.Gerak();
        burung.Gerak();
        kucing.Gerak();
    }
}
public class Burung extends anabul {
    @Override
    public void Suara() {
        System.out.println("Nama: Burung " + super .getNama() + "\nSuara: " + super.getSuara());
    }
    @Override
    public void Gerak() {
        System.out.println("Nama: Burung " + super .getNama() + "\nGerak: " + super.getGerak());
    }
    public Burung(String Nama, String Suara, String Gerak) {
        super(Nama, Suara, Gerak);
    }
}

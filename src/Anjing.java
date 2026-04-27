public class Anjing extends anabul {
    @Override
    public void Suara() {
        System.out.println("Nama: Anjing " + super .getNama() + "\nSuara: " + super.getSuara());
    }
    @Override
    public void Gerak() {
        System.out.println("Nama: Anjing " + super .getNama() + "\nGerak: " + super.getGerak());
    }
    public Anjing(String Nama, String Suara, String Gerak) {
        super(Nama, Suara, Gerak);
    }
    
}

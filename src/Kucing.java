public class Kucing extends anabul {
    @Override
    public void Suara() {
        System.out.println("Nama: Kucing " + super .getNama() + "\nSuara: " + super.getSuara());
    }
    @Override
    public void Gerak() {
        System.out.println("Nama: Kucing " + super .getNama() + "\nGerak: " + super.getGerak());
    }
    public Kucing(String Nama, String Suara, String Gerak) {
        super(Nama, Suara, Gerak);
    }
    
}
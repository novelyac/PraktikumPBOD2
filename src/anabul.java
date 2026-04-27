//nama : Novelya Cherina
//NIM : 24060124140174
//Lab : D2
//Tanggal : 21 April 2026
public class anabul{    
    private String Nama;
    private String Suara;
    private String Gerak;
    
        public anabul() {
        Nama = "-";
        Suara = "-";
        Gerak = "-";
    }
        public String getNama(){
            return Nama;
        }
        public void setNama(String Nama) {
            this.Nama = Nama;
        }
        public String getSuara() {
            return Suara;
        }
        public void setSuara(String Suara) {
            this.Suara = Suara;
        }
        public String getGerak() {
            return Gerak;
        }
        public void setGerak(String Gerak) {
            this.Gerak = Gerak;
        }
        public anabul(String Nama, String Suara, String Gerak) {
        this.Nama = Nama;
        this.Suara = Suara;
        this.Gerak = Gerak;
        }
        public void Nama() {
            System.out.println("Nama: " + Nama);
        }
        public void Gerak() {
            System.out.println("Gerak: " + Gerak);
        }
        public void Suara() {
            System.out.println("Suara: " + Suara);

            
        }
}

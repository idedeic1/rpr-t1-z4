package ba.etf.unsa;

public class Student {
    String ime;
    String prezime;
    int broj_indeksa;


    public Student(String im, int br, String prez) {
        this.ime = im;
        this.prezime=prez;
        this.broj_indeksa=br;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBroj_indeksa() {
        return broj_indeksa;
    }

    public void setBroj_indeksa(int broj_indeksa) {
        this.broj_indeksa = broj_indeksa;
    }
}

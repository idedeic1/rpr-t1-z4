package ba.etf.unsa;
import static java.lang.System.out;
import static java.lang.String.*;
public class Predmet {
    String Naziv;
    String Sifra;
    final static int Max_broj_studenata=0;
    private Student [] niz_studenata;

    public Predmet(String naziv, String sifra, Student[] niz_studenata) {
        Naziv = naziv;
        Sifra = sifra;
        this.niz_studenata = niz_studenata;
    }

    public void Upisi(Student ref){
        Student novi = new Student( ref.ime,ref.broj_indeksa, ref.prezime);

    }
    public void Ispisi(Student ref){
        char c1 ='(';
        char c2 = ')';
        System.out.printf("%s %s %c%d%c\n", ref.prezime, ref.ime, c1, ref.broj_indeksa, c2);

    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public String getSifra() {
        return Sifra;
    }

    public void setSifra(String sifra) {
        Sifra = sifra;
    }

    public Student[] getNiz_studenata() {
        return niz_studenata;
    }

    public void setNiz_studenata(Student[] niz_studenata) {
        this.niz_studenata = niz_studenata;
    }
}

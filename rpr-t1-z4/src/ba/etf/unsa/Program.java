package ba.etf.unsa;

class Program{
    public static void main (String [] args){
        Student[] niz = new Student[1];
        Predmet novi = new Predmet("RPR", "RPR-RI2", niz);
        niz[0] = new Student("Ibrahim", 17514, "Dedeic");
        novi.Upisi(niz[0]);
        novi.Ispisi(niz[0]);
        
    }
}
package Polimorfism;

public class Student {

    //Polimorfism = este de 2 feluri:
    //  dinamic/overriding - static/overloading

    //dinamic = intr-o ierarhie de clase obtinute prin mostenire
    //o metoda poate avea implementari diferite

    //static = conceptul prin care putem avea mai multe metode
    //cu acelasi nume si diferentierea se face prin nr-ul
    //de parametrii sau tipul parametrilor
    private String nume;
    private String prenume;
    private String adresa;

    //constructor
    public Student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    //getter/setter
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    //polimorfism dinamic
    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre student sunt: " + getAdresa() +" "+
                getNume() + " " + getPrenume());
    }
}

package Clasa_Abstracta;

public class Persoana_Angajat_Abstract extends Persoana_Abstract {

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana_Angajat_Abstract(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    @Override
    public void invata() {
        //System.out.println("Studentul " + nume + " " + prenume + " invata!");
    }

    @Override
    public void mergeLaCurs() {
        //System.out.println("Studentul " + nume + " " + prenume + " merge la curs");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + nume + " " + prenume + " munceste!");

    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul " + nume + " " + prenume + " primeste salar!");


    }

    }


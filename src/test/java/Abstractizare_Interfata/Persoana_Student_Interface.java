package Abstractizare_Interfata;

public class Persoana_Student_Interface extends Persoana_Interface implements I_Student{
    public Persoana_Student_Interface(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void invata() {
        System.out.println("Studentul " + nume + " " + prenume + " invata!");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul " + nume + " " + prenume + " merge la curs");


    }
}

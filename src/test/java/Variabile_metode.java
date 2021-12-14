import org.junit.Test;

public class Variabile_metode {
    //clase, variabile, metode, constructor, obiect

    //1-clase = un sablon ce contine,variabile,metode,constructor,obiect
        //structura clasa = access control class nume-clasa{}
        //un fisier java poate contine una sau mai multe clase
        //numele clasei trebuie sa fie unic
    //2-variabile = atributul unei clase
        //tipuri variabile = global si local
            //variabila globala = vizibila peste tot in clasa declarata
                //structura variabila globala = access control tip-variabila nume;
                    //o variabila poate avea sau nu o valoare
                //structura variabila locala = tip-variabila nume;
                    //ex:declaram variabile in interiorul clasei
    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;

    //3-metoda = actiunile unei clase
        //tipuri metode = void si return
        //in java exista DOAR metode(declarate in interiorul unei clase) nu si functii
        //metodele pot avea sa nu parametrii
        //structura metoda void = access control void nume-metoda(){}

    @Test
    public void atribuieValori(){
        nume = "Boros";
        prenume = "Madalina";
        varsta = 26;
        inaltime = 1.70;
        adresa = "Aurel Vlaicu nr.36";
        esteAngajat = false;
        greutate = 52.0;
        System.out.print(nume + " " + prenume );
        System.out.print(" " + esteAngajat);

        System.out.println(" " + varsta + " " + inaltime + " " + adresa);

        System.out.println(nume + "\r\n" + prenume);

        //afiseaza pe consola: cursantul <nume> <prenume> a trimis proiectul la manual
        System.out.println("Cursantul " + nume + " " + prenume + " a trimis proiectul la manual.");

        System.out.println(String.format("%.2f", greutate));

        System.out.println(getSalarAngajat());
    }

    //returnam salarul unui angajat
    //structura metoda return: public tipul de returnare nume(){return}

    public Double getSalarAngajat(){
        Double salar = 10000.0;
        Double bonus = 25000.0;
        Double calcul = salar * bonus;
        return calcul;
    }

    //4-
}

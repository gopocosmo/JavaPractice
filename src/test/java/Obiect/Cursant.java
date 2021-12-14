package Obiect;

import java.util.List;

public class Cursant {
    //obiect = instanta unei clase
    //dintr-o clasa putem declara N obiecte
    //pt a initializa un obiect folosim cuvantul cheie "new"
    //structura obiect: nume_clasa + nume_obiect = new + nume_clasa(se va apela constructorul clasei)(se vor da valori pt variabile,daca exista)
    //ex:Cursant Vlad = new Cursant()
    //Constructor = are ca rol sa initializeze atributele unei clase
    //intr-o clasa putem defini N constructori diferentiati prin parametrii sau nr de paramatrii
    //constructorul dintr-o casa trebuie sa fie tot timpul public
    //structura constructor = public nume_clasa(definim parametrii daca avem nevoie){}
    //in cazul in care nu declaram un constructor => este unul implicit(constructor implicit)
    //this = arata catre variabila din interiorul clasei tot timpul
    //se aplica daca avem 2 variabile cu acelasi nume

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Boolean esteAngajat;
    public List<String> cursuri;
    public String curs;

    public Cursant(String nume,String prenume,Integer varsta,Double taxa,Boolean esteAngajat,List<String> cursuri){
       this.nume = nume;
       this.prenume = prenume;
       this.varsta = varsta;
       this.taxa = taxa;
       this.esteAngajat = esteAngajat;
       this.cursuri = cursuri;
    }


    public Cursant(String nume,String prenume,Integer varsta,Double taxa,Boolean esteAngajat,String curs){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.esteAngajat = esteAngajat;
        this.curs = curs;
    }

    public Cursant(String nume,String prenume,Integer varsta,Boolean esteAngajat,String curs){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.esteAngajat = esteAngajat;
        this.curs = curs;
    }



    public void dateCursantCursuri(){
        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Prenumele cursantului este: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("Taxa este: " + taxa);
        System.out.println("Este cursantul angajat " + esteAngajat);
        System.out.println("Cursantul este inscris la urmatoarele cursuri :");
        for(String curs : cursuri){
            System.out.println(curs);
        }
    }

    public void dateCursantCurs(){
        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Prenumele cursantului este: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("Taxa este: " + taxa);
        System.out.println("Este cursantul angajat " + esteAngajat);
        System.out.println("Cursantul este inscris la urmatorul curs :" + curs);

    }

    public void dateCursantCursFaraTaxa(){
        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Prenumele cursantului este: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("NU VREA SA PLATEASCA TAXA");
        System.out.println("Este cursantul angajat " + esteAngajat);
        System.out.println("Cursantul este inscris la urmatorul curs :" + curs);

    }


    public void verificaVarstaCursant(){
        if (varsta >= 65){
            System.out.println("Cursantul este pensionar");
        }else if (varsta <=18){
            System.out.println("Cursantul este major");
        }else {
            System.out.println("Cursantul nu este major");
        }
    }


}

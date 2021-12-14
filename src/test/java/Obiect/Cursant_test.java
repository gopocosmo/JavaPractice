package Obiect;

import org.junit.Test;

import java.util.Arrays;

public class Cursant_test {

    @Test
    public void testAutomat(){
    //declaram un obiect de tipul cursant
        System.out.println("----obiectul Vlad-----");
    Cursant Vlad = new Cursant("Domide","Vlad-Calin",35,
            5000.0,true, Arrays.asList("Manual Testing","Programare Java","Automation Testing"));

    Vlad.dateCursantCursuri();
    Vlad.verificaVarstaCursant();
        Vlad.prenume = "Victor";
        Vlad.dateCursantCursuri();

        System.out.println("----obiectul GAbi----");
    Cursant Gabi = new Cursant("Salajan","Gabriela",23, 5000.0,false, Arrays.asList("Programare Java","Programare C#"));
    Gabi.dateCursantCursuri();
    Gabi.verificaVarstaCursant();

        System.out.println("----obiectul CAlin----");

        Cursant Calin = new Cursant("Domide","Calin",23,
                5000.0,false, "devops");
        Calin.dateCursantCurs();

        System.out.println("----obiectul Paul----");

        Cursant Paul = new Cursant("Domide","Calin",23,false, "devops");

        Paul.dateCursantCursFaraTaxa();


    }

}

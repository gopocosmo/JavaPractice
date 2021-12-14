package Polimorfism;

import org.junit.Test;

public class Polimorfism_Test {

    @Test
    public void testAutomat(){

       Student_FF Alex = new Student_FF("Dorha", "Alex",
               "Cluj,Fabricii");
       Alex.mediaStudentului(5, 5, 5);
       Alex.mediaStudentului(6,6);
       Alex.afiseazaInfoStudent();
       Alex.afiseazaInfoInitial();

        Student_CF Vlad = new Student_CF("Domide", "Vlad-Calin",
                "Cluj,Brancusi");
        Vlad.mediaStudentului(7, 4, 9);
        Vlad.mediaStudentului(6,10);
        Vlad.afiseazaInfoStudent();
        Vlad.afiseazaInfoInitial();
    }


}

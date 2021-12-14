package Abstractizare_Interfata;

import org.junit.Test;

public class Interface_Test {
    @Test
    public void testAutomatDoi(){
        Persoana_Student_Interface student = new Persoana_Student_Interface("Cuza", "Voda", 140);

        student.invata();
        student.mergeLaCurs();

        Persoana_Angajat_Interface angajat = new Persoana_Angajat_Interface("Groza", "Petru", 666);
        angajat.munceste();
        angajat.primesteSalar();

        Persoana_Student_Angajat_Interface angajatStudent = new Persoana_Student_Angajat_Interface("Descris", "Ceva", 665);
        angajatStudent.invata();
        angajatStudent.mergeLaCurs();
        angajatStudent.munceste();
        angajatStudent.primesteSalar();


    }
 }

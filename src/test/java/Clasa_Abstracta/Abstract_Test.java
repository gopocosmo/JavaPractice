package Clasa_Abstracta;

import Abstractizare_Interfata.Persoana_Angajat_Interface;
import Abstractizare_Interfata.Persoana_Student_Angajat_Interface;
import Abstractizare_Interfata.Persoana_Student_Interface;
import org.junit.Test;

public class Abstract_Test {

    @Test
    public void testAutomatTrei(){

        Persoana_Student_Abstract student = new Persoana_Student_Abstract("Cuza", "Voda", 140);

        student.invata();
        student.mergeLaCurs();

        Persoana_Angajat_Abstract angajat = new Persoana_Angajat_Abstract("Groza", "Petru", 666);
        angajat.munceste();
        angajat.primesteSalar();

        Persoana_Student_Angajat_Abstract angajatStudent = new Persoana_Student_Angajat_Abstract("Descris", "Ceva", 665);
        angajatStudent.invata();
        angajatStudent.mergeLaCurs();
        angajatStudent.munceste();
        angajatStudent.primesteSalar();

        angajatStudent.detaliiVarsta(21);
    }
}

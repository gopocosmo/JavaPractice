package Acces_Control;

import Protected.Voluntar;

public class PiezisaMa extends Voluntar {

    public PiezisaMa(String nume, String prenume) {
        super(nume, prenume);
    }

    public void metodaHabarNam(){
        metodaPublica();
        metodaProtected();
    }
}

package Protected;

public class Teatru {
    public void habarNamDoi(){
        Voluntar Ghita = new Voluntar("Gherasim", "Avram");
        Ghita.metodaPublica();
        Ghita.metodaDefault();
        Ghita.metodaProtected();
    }

}

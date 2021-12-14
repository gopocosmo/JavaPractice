package Polimorfism;

public class Student_CF extends Student{

    public Student_CF(String nume, String prenume, String adresa) {
        super(nume, prenume, adresa);
    }

    public void mediaStudentului(Integer notaUnu, Integer notaDoi){
        Integer medie = (notaUnu + notaDoi)/ 2;
        System.out.println("Media studentului CF este: " + medie);
    }

    public void mediaStudentului(Integer notaUnu, Integer notaDoi, Integer notaTrei){
        Integer medie = (notaUnu + notaDoi + notaTrei)/ 3;
        System.out.println("Media studentului CF este: " + medie);
    }

    @Override
    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre student CF sunt: " + getAdresa() +" "+
                getNume() + " " + getPrenume());
    }

    public void afiseazaInfoInitial(){
        super.afiseazaInfoStudent();
    }
}

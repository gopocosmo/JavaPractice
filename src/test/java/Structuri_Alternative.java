import org.junit.Test;

public class Structuri_Alternative {

    //cele mai des intalnite structuri in programare sunt alternative
    //Structura alternativa:
        //if (conditie) then
            //else


    @Test
    public void testAutomat(){

        verificaNumere();
        verificaNume();
        verificaParitate(12);
        verificaParitate(15);
        verificaParitate(-8);
        verificaParitate(-7);
        afisamZiua("Luni");
    }

    //verificam daca 5 > 3
    public void verificaNumere(){
        if (5 > 3){
            System.out.println("Corect");
        }
        else{
            System.out.print("Nu este corect");
        }


    }

    //verificam daca Alexandru contine Alex
    public void verificaNume(){
        String continut = "Alex";
        String nume = "Alexandru";
        if(nume.contains(continut)){
            System.out.println("Intradevar Alexandru contine Alex");
        }
        else{
            System.out.print("Nu este adevarat");
        }

    }

    //verificam daca un numar este par sau impar si pozitiv
    public void verificaParitate(Integer numar){
        if(numar%2 == 0){
            System.out.println("Numarul " + numar + " este par");
        }
        if (numar%2 == 1){
            System.out.println("Numarul " + numar + " este impar");
        }
        if (numar > 0){
            System.out.println("Numarul " + numar + " este si pozitiv");
        }
        else{
            System.out.println("Numarul " + numar + " nu este pozitiv");
        }
    }


    //afisam in consola ziua in curs
    public void afisamZiua(String ziua){
        switch (ziua){
            case "Duminica":
                System.out.println("Astazi e Duminica");
                break;
            case "Luni":
                System.out.println("Astazi este Luni");
                break;
            case "Marti":
                System.out.println("Astazi este Marti");
                break;
        }
    }
}

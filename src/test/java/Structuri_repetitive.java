import org.junit.Test;

public class Structuri_repetitive {
    //cele mai intalnite structuri repetitive sunt: for si while



    @Test
    public void testAutomat(){

    afisamNumereFor(10);
    afisamNumereWhile(10);
    }


    //afisam primele 50 numere
    public void afisamNumereFor(Integer limit){
        for (Integer i = 0;i <= limit; i++){
            System.out.print(i + " ");
        }
    }

    public void afisamNumereWhile(Integer limit){
        Integer i = 0;
        while (i <= limit){
            System.out.println(i + " ");
            i++;
        }
    }

}

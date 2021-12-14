import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void testAutomat(){

        System.out.println("1.Array de numere ");
        printeazaArrayNumere();
        System.out.println("2.Array nume ");
        printeazaArrayNume();
        System.out.println("3.Lista valori ");
        printeazaListaValori();
        System.out.println("4.Hashmap valori");
        printeazaHashMapValori();
        System.out.println("5.afisam orase-tari");
        printeazaListaOrase();
    }

    //vectori
    public void printeazaArrayNumere() {
        Integer[] ArrayNumere = new Integer[4];
        ArrayNumere[0] = 4;
        ArrayNumere[1] = 5;
        ArrayNumere[2] = 6;
        ArrayNumere[3] = 7;
        for (Integer i = 0; i < ArrayNumere.length; i++) {
            System.out.println("Numarul din lista este: " + ArrayNumere[i]);
        }
        System.out.println("Ultimul element din lista este: " + ArrayNumere[ArrayNumere.length - 1]);

    }


    public void printeazaArrayNume(){
        String [] ArrayString = new String[4];
        ArrayString[0] = "Madalina";
        ArrayString[1] = "Alex";
        ArrayString[2] = "Vlad";
        for (Integer x = 0;x < ArrayString.length - 1;x++){
            System.out.println("Numele curent este: " + ArrayString[x]);
        }
    }


    public void printeazaListaValori(){
        List<String> listaValori = new ArrayList<>();
        listaValori.add("Madalina");
        listaValori.add("Alex");
        listaValori.add("Vlad");
        for (Integer i = 0; i < listaValori.size();i++){
            System.out.println("Numele din lista este: " + listaValori.get(i));
        }
    }

    public void printeazaHashMapValori(){
        //hashmap functioneaza dupa logica de key=value aka dictionary
        HashMap<String,String> mapValori = new HashMap<>();
        mapValori.put("nume","Boros");
        mapValori.put("prenume1","Madalina");
        mapValori.put("prenume2","Georgeta");
        for (String key: mapValori.keySet()){
            System.out.println("Cheia este "+ key);
            System.out.println("Valoarea este: "+ mapValori.get(key));
        }
    }

    public void printeazaListaOrase(){
        List<String> listaOraseRomania=new ArrayList<>();
        listaOraseRomania.add("Cluj-Napoca");
        listaOraseRomania.add("Timisoara");
        listaOraseRomania.add("Arad");
        listaOraseRomania.add("Bistrita");
        List<String> listaOraseSpania= new ArrayList<>();
        listaOraseSpania.add("Barcelona");
        listaOraseSpania.add("Madrid");
        listaOraseSpania.add("Valencia");
        HashMap<String,List<String>> mapTari = new HashMap<>();
        mapTari.put("Romania",listaOraseRomania);
        mapTari.put("Spania", listaOraseSpania);
        for (String key: mapTari.keySet()){
            System.out.println("Orasele care apartin de tara " + key + " sunt urmatoarele:");
            List<String> orase = mapTari.get(key);
            for (Integer i = 0;i < orase.size();i++){
                System.out.println(orase.get(i));
            }
        }
    }
}

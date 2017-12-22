package c;

import java.util.*;

public class Zad4{
    public static void main(String[] args) {


        List<Kalorie> lista = new ArrayList<>();



        //----DODAWANIE ELEMENTOW DO LISTY---
        lista.add(new Kalorie(4));
        lista.add(new Kalorie(88));
        lista.add(new Kalorie(1));
        lista.add(new Kalorie(757));
        lista.add(new Kalorie(22));

        for (Kalorie lis : lista)
            lis.ile_kalorii();

        //----WYSWIETLANIE LICZBY KALORII ELEMENTOW LISTY----
        /*lista.get(0).ile_kalorii();
        lista.get(1).ile_kalorii();
        lista.get(2).ile_kalorii();
        lista.get(3).ile_kalorii();
        lista.get(4).ile_kalorii();
*/

    }
}
class Kalorie {

    int ile;

    Kalorie(int i){
        ile = i;
    }

    void ile_kalorii()
    {
        System.out.println(ile);
    }








    /*int a;
    static int licznik_indeksow=1;

    Kalorie(int i) {
        int ile = (int)(Math.random()*i);
        System.out.println("Tworze obiekt Kalorie o indeksie: "+licznik_indeksow+" i liczbie kalorii: "+ile);
        licznik_indeksow++;
        a=ile;
    }


    void ile_kalorii(){
        System.out.println("Liczba kalorii: " + a);
    }
    */
}







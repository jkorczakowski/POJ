package d;

import java.util.Random;

public class Zad5 {
    public static void main(String args[])
    {
        double tab[] = {2,1,1,1};
        double tab1[] = {3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        Wielomian a = new Wielomian();
        a.losuj(20);
        a.wyswietl();
        a.dodaj(tab1);
        a.wyswietl();
        a.dodaj(tab);
    }
}


class Wielomian{
    int wspolczynniki[] = new int [15];

    void losuj(int zakres)
    {
        Random generator = new Random();
        for(int i=0 ;i<wspolczynniki.length; i++)
            wspolczynniki[i] = generator.nextInt(zakres);
    }

    void wyswietl()
    {
        for(int i=0; i<wspolczynniki.length; i++)
            System.out.println(i + " " + wspolczynniki[i]);
    }

    void dodaj(double tab[])
    {
        if(tab.length<wspolczynniki.length)
            System.out.println("Tablica dodająca jest za mała");
        else
            for(int i = 0; i<wspolczynniki.length; i++)
                wspolczynniki[i] += (int) (tab[i]);

    }
}
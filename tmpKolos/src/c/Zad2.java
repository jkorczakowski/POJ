package c;

import java.util.Random;

public class Zad2 {
    public static void main(String[] args){
        Pomiary pomiary = new Pomiary();


        pomiary.pobierz(0,30);
        pomiary.wyswietl();

        double tab[] = {1,2,3,4,5,6,7,8,9};
        double tab1[] = {1,2,2,3,4};
        pomiary.korekta(tab1);
        pomiary.korekta(tab);

        pomiary.wyswietl();
    }
}


class Pomiary{
    int wyniki[] = new int[7];

     void pobierz(int a1, int a2)
    {

        for(int i=0;i<7;i++) {
            wyniki[i]=(int)(Math.random()*(a2-a1) + a1);

        }
    }

    void wyswietl()
    {
        for(int i=0;i<7;i++){
            System.out.println(i + ". " + wyniki[i]);
        }

    }

    void korekta(double tab[])
    {
        if (tab.length<7)
            System.out.println("Tablica tab jest za mała!");
        else
        {
            for(int i=0;i<7;i++) {
                wyniki[i] += (int)(tab[i]);
            }
        }


    }
}

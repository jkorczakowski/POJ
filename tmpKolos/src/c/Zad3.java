package c;

import java.awt.event.*;

public class Zad3 {
    public static void main(String[] args) throws Exception {



        Ograniczenie o1 = new Ograniczenie(1);
        Ograniczenie o2 = new Ograniczenie(2);
        Ograniczenie o3 = new Ograniczenie(3);
        Ograniczenie o4 = new Ograniczenie(4);
        Ograniczenie o5 = new Ograniczenie(5);
        Ograniczenie o6 = new Ograniczenie(6);
        Ograniczenie o7 = new Ograniczenie(7);




    }
}

class Ograniczenie {

    static int ilosc = 0;

    int liczba;
     Ograniczenie(int l) throws Exception
    {
        if (ilosc >4)
            throw new Exception("Za duzo obiektow");
        else {
            liczba =l;
            ilosc++;
        }
    }
}










package d;

import java.util.ArrayList;

public class Zad2 {
    public static void main(String args[]) {

        ArrayList<Osoba> lista = new ArrayList<>();

        lista.add(new Osoba(180));
        lista.add(new Osoba(178));
        lista.add(new Osoba(160));
        lista.add(new Osoba(170));

        for(Osoba lis : lista)
            lis.jaki_wzrost();

       // lista.get(0).jaki_wzrost();

    }
}


class Osoba{
    int wzrost;
    Osoba(int arg) {
        wzrost =  arg;
    }

    void jaki_wzrost()
    {
        System.out.println(wzrost);
    }
}
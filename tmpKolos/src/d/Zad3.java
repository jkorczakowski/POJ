package d;

public class Zad3 {
    public static void main(String args[]) throws Exception
    {
        Licznik a = new Licznik(0);
        Licznik b = new Licznik(1);
        Licznik c = new Licznik(2);
        Licznik d = new Licznik(3);
        Licznik e = new Licznik(4);

    }
}


class Licznik
{
    int licznik = 0;

    Licznik(int i) throws Exception {

        if (i > 3)
        {
        throw new Exception("Za dużo obiektów");
        }



    }
}
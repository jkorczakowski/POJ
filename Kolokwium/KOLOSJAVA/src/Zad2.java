import java.util.ArrayList;

/* Juliusz Korczakowski
 * 21.12.17
 * Zad 2b
Napisz klasę "Liczby" z polem całkowitym "liczba", które inicjowane jest w konstruktorze.
 Dodaj metodę o nazwie wypisz() wypisującą na ekranie wartość pola "liczba".
  Stwórz ArrayList i wypełnij tę listę kilkoma obiektami klasy "Liczby".
  Następnie wykorzystaj metodę get() do poruszania się po liście i wywołaj metodę wypisz()
  dla każdego z obiektów. Wykorzystaj nową składnię pętli for dla kolekcji.
 */
public class Zad2 {
    public static void main(String args[]){

        ArrayList<Liczby> lista = new ArrayList<>();

        lista.add(new Liczby(0));
        lista.add(new Liczby(1));
        lista.add(new Liczby(2));
        lista.add(new Liczby(3));
        lista.add(new Liczby(4));


        for(Liczby lis : lista)
            lis.wypisz();
    }
}


class Liczby{
    int liczba;

    Liczby(int liczba){
       this.liczba = liczba;
    }

    void wypisz()
    {
        System.out.println(liczba);
    }
}

/* Juliusz Korczakowski
 * 21.12.17
 *
 * Zad 5b
W klasie "Firma" utwórz pole "nazwa" będące czteroelementową tablicą nazw firm.
W klasie "Regon" utwórz pole "numer" będące czteroelementową tablicą numerów Regon.
Obie tablice zainicjuj wymyślonymi wartościami w miejscu deklaracji tablicy.
W metodzie main() klasy "RegonFirmyTest" stwórz obiekty klas "Firma" i "Regon".
Stwórz też tablicę o nazwie "dane_firmy" (odpowiedniego rozmiaru) i wypełnij ją parami
(konkatenacja łańcuchów znaków) odpowiednich nazw firm i numerów Regon z tablic obiektów "Firma" i "Regon".
Wyświetl zawartość tabeli "dane_firmy" na ekranie.
 */


class Firma{
    String nazwa[] = {"BOMA","ANTYK","OREO","FIDYTECH"};

}

class Regon{
    int numer[] = {4859,2137,8147,9021};
}

class RegonFirmyTest {
    public static void main(String[] args) {
        Firma a = new Firma();
        Regon b = new Regon();

        String dane_firmy[] = new String[4];

       for (int i = 0; i < dane_firmy.length; i++)
           dane_firmy[i] = a.nazwa[i] + " " + b.numer[i];

       for(int i = 0; i<dane_firmy.length; i++)
       System.out.println(dane_firmy[i]);


    }
}
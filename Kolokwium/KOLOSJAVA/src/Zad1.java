/* Juliusz Korczakowski
 *
 * 21.12.2017
 *
 * Czy istnieje możliwość, aby zrealizować kod programu wznawiający od początku swoje wykonanie
 * po napotkaniu sytuacji wyjątkowej? Jeśli tak to utwórz klasę o nazwie "Informacja" sprowokuj taką sytuację
  * i wypisz odpowiednie informacje na ekranie potwierdzające taką możliwość.
  * Jeśli nie to dodatkowo załącz na początku utworzonego kodu programu odpowiedni komentarz.
 */


import static java.lang.System.runFinalization;
import static Informacja.test;
public class Zad1 {
    public static void main(String args[]){

        try {
            test("Cont");
        } catch (Throwable) {
            runFinalization();
        }


    }
}

class Informacja extends Exception{

   static String arg;
    Informacja(String arg)
    {
        this.arg = arg;


    }

    public String toString(){
        return arg;
    }

    static Throwable test (String arg) {
        if (arg.equals("Cont"))
            throw runFinalization();
    }
}


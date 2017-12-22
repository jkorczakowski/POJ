/* Juliusz Korczakowski
 * 21.12.2017
 * Zad 3b
Czy można utworzyć obiekt klasy abstrakcyjnej bez żadnych metod abstrakcyjnych?
Stwórz dowolną abstrakcyjną klasę o nazwie "Sprawdzenie" i sprawdź.
 Opisz swoje wnioski w komentarzu na początku pliku.


 WNIOSKI: Nie można utworzyć obiektu klasy abstrakcyjnej.
 Error:(11,25) java: Sprawdzenie is abstract; cannot be instantiated
 */

public class Zad3 {
    public static void main(String args[]){
        //Zgodnei z powyższym wnioskiem, zakomentowane do umożliwenia kompilacji innych zadań
     //   Sprawdzenie a = new Sprawdzenie();


    }
}


abstract class Sprawdzenie{}

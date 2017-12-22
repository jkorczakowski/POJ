/* Juliusz Korczakowski
 * 21.12.17
 * Zad 4b
Utwórz klasę o nazwie "Matka" z dowolną metodą. Następnie utwórz klasę potomną o nazwie "Dziecko",
 która dziedziczy wszystko z klasy "Matka". Czy w klasie "Dziecko" można przeciążyć metodę z klasy "Matka"?
  Napisz kod programu, który realizuje powyższą sytuację. Na początku pliku opisz swoje wnioski.
 */

public class Zad4 {
    public static void main(String args[]){

        Matka a = new Matka();
        Dziecko b = new Dziecko();

        System.out.println(a.Method());
        System.out.println(a.Method(1));
        System.out.println(b.Method(1,2));

    }
}

class Matka{
    //Domyslna metoda
    int Method()
    {
        return 0;
    }

    //Przeciążenie metody
    int Method(int a){
        return a;
    }
}

class Dziecko extends Matka{
    //Przeciązenie metody z klasy Matka
    int Method(int a, int b){
        return a+b;
    }
}
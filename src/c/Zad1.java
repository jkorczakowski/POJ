/*
Zadanie 1c
Utwórz klasę "Mleko" z dowolną metodą. Utwórz klasę "Ser", która dziedziczy
wszystko z klasy "Mleko". Czy w klasie "Mleko" i czy w klasie "Ser" można
przeciążyć metodę z klasy "Mleko"? Napisz kod programu demonstrujący
działanie takiej sytiacji i na początku program w komentarzu opisz swoje wnioski.

WNIOSKI: Można przeciężyć zarówno metody w klasie mleko jak i metodę z klasy
mleko w klasie ser.
 */


public class Zad1c {
    public static void main(String[] main) {
        Mleko a = new Mleko();
        int first;
        int second;
        int third;
        first = a.ilosc();
        second = a.ilosc(2.9);
        Ser b = new Ser();
        third = b.ilosc(5);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}

class Mleko{
    int ilosc(){
        return 1;
    }
    int ilosc(double litry){
        return (int)litry;
    }
}

class Ser extends Mleko{
    int ilosc(int litry){
        return litry;
    }

}

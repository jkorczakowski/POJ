package c;

public class Zad5{

    static void sprobuj(String a) throws MyException {
        System.out.println("Wywolanie sprobuj("+ a +")");
        if(a.equals("szaszlyk"))
            throw new MyException(a);
        System.out.println("Normalne zakonczenie");
    }


    public static void main(String args[]) {

        try {
            sprobuj("a");
            sprobuj("szaszlyk");
        }
        catch (MyException c) {
            System.out.println(c);
        }
    }


}

class MyException extends Exception {
    private static String b;

    MyException(String a) {
        b = a;
    }

    public String toString() {
        return "Wypisanie lancucha uzywajac wyjatku: " + b;
    }
}




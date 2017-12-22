package d;

public class Zad4 {
    public static void main(String args[])
    {
        Rodzic a = new Rodzic();
        Potomek b = new Potomek();
        System.out.println(a.Method());
        System.out.println(a.Method(1));
        System.out.println(b.Method(1,1));
    }
}


class Rodzic
{
    int Method()
    {
        return 0;
    }

    int Method(int a)
    {
        return a;
    }
}
class Potomek extends Rodzic{
    int Method(int a, int b)
    {
        return a+b;
    }

}
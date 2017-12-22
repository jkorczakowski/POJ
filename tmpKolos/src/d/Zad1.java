package d;

import static d.MyException.test;

public class Zad1 {
    public static void main(String args[])
    {
        try{
            test("dupa");
            test("and");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}


class MyException extends Exception {
    String arg;
    MyException(String arg)
    {
        this.arg = arg;
    }



    public String toString() {
    return arg;
    }

    static void test(String arg) throws MyException
    {
       // System.out.println(arg);
        if(arg.equals("dupa"))
            throw new MyException(arg);
    }
}
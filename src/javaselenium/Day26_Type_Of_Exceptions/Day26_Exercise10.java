package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise10 {
    public static void main(String[] args) {

    }

    static void divideByZero(int a) {

        //check something
        if(a==0)
        {
            throw new ArithmeticException();
        }
    }
}

package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Exceptions;

public class Day25_Exercise7_exception {
    public static void main(String[] args) {

        int a=0;
        try {
            a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}

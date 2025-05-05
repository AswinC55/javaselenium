package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Wrapper;

public class Day25_Exercise2_WrapperConversion {
    public static void main(String[] args) {

        int a1=10;
        Integer b1 = a1;  // This is Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing -> Attributes and Behaviour will be added
        System.out.println(b1.intValue());
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        Integer a2 = 20;
        int b2 = a2;  // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(b2);


    }
}

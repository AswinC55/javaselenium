package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Wrapper;

public class Day25_Exercise1_Wrapper {
    public static void main(String[] args) {
        int a=10;   // primitive
        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 66;
        System.out.println(Integer.toHexString(age));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());

        ATB1 a1 = new ATB1();
        System.out.println(a1.name);
        System.out.println(a1.phone);
        System.out.println(a1.age);
        System.out.println(a1.salary);
        System.out.println(a1.GST);
        System.out.println(a1.isMarried);


    }
}

class ATB1{

    String name;
    Long phone;
    Integer age;
    Double salary;
    Float GST;
    Boolean isMarried;

    // int -> data types
    // Integer -> Object -> attribute, behaviour
    // In future -> to convert the age -> string, primitive to hexValue... else you can now do it.

}

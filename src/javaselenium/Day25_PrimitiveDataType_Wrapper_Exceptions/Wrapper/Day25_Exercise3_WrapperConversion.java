package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Wrapper;

public class Day25_Exercise3_WrapperConversion {
    public static void main(String[] args) {
        String num = "10" ;

        //String to Wrapper -  parseX()  ,   Integer.parseInt(num); Double.parseDouble()
        Integer b = Integer.parseInt(num);
        Integer c = Integer.valueOf(num);
        System.out.println(b);
        System.out.println(c);

        //String to Primitive
        int a = Integer.parseInt(num);
        System.out.println(a);


        //Wrapper to String  (toString Method)
        System.out.println(b.toString());

        //Primitive to String - Primitive to Wrapper to String(toString)
        int age = 10;
        Integer age_wrapper = age;

        System.out.println(age_wrapper.toString());

    }
}

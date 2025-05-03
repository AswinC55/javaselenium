package javaselenium.Day24_IIB_Static_Enum.Static;

public class Day24_Exercise6_Static {
    public static void main(String[] args) {

        Automation a1 = new Automation();
        System.out.println(Automation.driver);

        Automation a2 = new Automation();
        Automation a3 = new Automation();
        System.out.println(a2.driver);
        System.out.println(a3.driver);
    }
}

class Automation{

    static String driver = "Chrome";
}
package javaselenium.Day24_IIB_Static_Enum.IIB;

public class Day24_Exercise1_IIB {
    public static void main(String[] args) {

        // ```
        //IIB
        //Instance initialization Block == IIB
        //I will be executed when Object is created.
        //```

        A a = new A();
    }
}

class A{

    A()
    {
        System.out.println("Default Constructor" );
    }

    {
        System.out.println("Hi, I am IIB");
        System.out.println("I will be executed first");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }

    {
        System.out.println("I will be executed second");
    }

    {
        System.out.println("IIB 3");
    }
}

package javaselenium.Day21_Inheritance_Types_and_Polymorphism.Hierarchical_Inheritance.Method_Overriding;

public class Day21_Method_Overriding2 {
    public static void main(String[] args) {

        common_to_all c1 = new common_to_all();
        c1.open_browser();

        chrome c2 = new chrome();
        c2.open_browser();

        edge c3 = new edge();
        c3.open_browser();

        //Dynamic Dispatch

        common_to_all c4 = new chrome();
        c4.open_browser();

        common_to_all c5 = new edge();
        c5.open_browser();

       // chrome c6 = new edge();
       //
        // c6.open_browser();
    }
}

class common_to_all{

    void open_browser()
    {
        System.out.println("Open Any Browser");
    }
}

class chrome extends common_to_all{

    @Override
    void open_browser() {
        System.out.println("Open Chrome");
    }
}

class edge extends common_to_all{

    @Override
    void open_browser() {
        System.out.println("Open Edge");
    }
}



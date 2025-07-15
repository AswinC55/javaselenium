package javaselenium.Day27_Generics;

public class Day27_Exercise1 {
    public static void main(String[] args) {
        temp_sum(4,5);
        temp_sum(3.5, 5.5);
        temp_sum("Pramod","Dutta");
    }

    static <K> K temp_sum(K a, K b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

        

}

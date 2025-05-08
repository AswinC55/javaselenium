package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise12 {
    public static void main(String[] args) {

        Bank12 sbi = new Bank12("INR", 100);
        Bank12 icici = new Bank12("INR", 123);
        Bank12 jp_chase = new Bank12("USD", 101);
       // int total = sbi.add(icici);
       // System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));

    }
}

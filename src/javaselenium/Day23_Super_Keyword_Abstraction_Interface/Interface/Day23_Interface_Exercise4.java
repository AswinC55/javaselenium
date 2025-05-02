package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Interface;

public class Day23_Interface_Exercise4 {
    public static void main(String[] args) {

    }
}


interface I11{}
interface I12{}
class A1{}
class B1{}
abstract class Pramod{  //abstract class
    abstract void pp();
}
class Test1 extends A1{}
//class Test2 extends A1,B1{} // Multiple Interheritance in class is not allowed
class Test3 implements I11{}
class Test4 implements I12,I11{}  // Multiple Interheritance in interface is allowed
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I11 extends A1{}
//interface I3 extends A1{}
interface I3{}
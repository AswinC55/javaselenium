package javaselenium.Day27_Generics;

public class Day27_Exercise2 {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass<>(5);
        GenericClass<String> StringObjRef = new GenericClass<>("Pramod");
        System.out.println(intObjRef.getData());
        System.out.println(StringObjRef.getData());
    }
}

class GenericClass <T>
{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData()
    {
        return this.data;
    }

}
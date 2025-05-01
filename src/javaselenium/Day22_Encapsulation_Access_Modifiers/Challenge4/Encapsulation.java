package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge4;

public class Encapsulation {
    public static void main(String[] args) {

        ATB a1 = new ATB("Praveen", 24, "ATB10");
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getCourse());
        System.out.println("---");

        a1.setName("Siva");
        System.out.println(a1.getName());
        a1.setAge(27);
        System.out.println(a1.getAge());
        a1.setCourse("ATB11", false);
        System.out.println(a1.getCourse());
        a1.setCourse("ATB12", true);
        System.out.println(a1.getCourse());

    }
}

class ATB{


    private String name;
    private int age;
    private String course;

    ATB(String name, int age, String course)
    {
        this.name=name;
        this.age = age;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course, boolean isadmin) {
        if(isadmin)
        {
            this.course=course;
            System.out.println("Able to change course");
        }
        else
        {
            System.out.println("Not able to change course");
        }
    }


}

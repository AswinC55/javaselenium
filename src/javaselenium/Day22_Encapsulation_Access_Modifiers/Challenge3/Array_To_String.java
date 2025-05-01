package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge3;

public class Array_To_String {
    public static void main(String[] args) {

        students s1[] = new students[2];
        s1[0]=new students("Praveen", 2, "Cse");
        s1[1]=new students("Siva", 3, "MECH");

        for (students s : s1)
        {
            System.out.println(s);
        }

    }
}

class students{

    String name;
    int roll_no;
    String course;

    students(String nam, int ro, String co)
    {
        this.name=nam;
        this.roll_no=ro;
        this.course=co;
    }

    public String toString()
    {
        return "Name: " +name+ ", Roll No: " +roll_no+ ", Course: " +course;

    }


}
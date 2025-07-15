package javaselenium.Day28_ArrayList_LinkedList_Vector;

import java.util.ArrayList;
import java.util.List;

public class Day28_Student_AL_Exercise12 {
    public static void main(String[] args) {

        Student s1 = new Student("Aswin", "1");
        Student s2 = new Student("Praveen", "2");
        Student s3 = new Student("Siva", "3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.print_details();
        s2.print_details();
        s3.print_details();


    }
}

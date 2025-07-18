package javaselenium.Day29_Set_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day29_Comparable_Exercise6 {
    public static void main(String[] args) {

        Student s1 = new Student(3, "Aswin", 24);
        Student s2 = new Student(1, "Praveen", 21);
        Student s3 = new Student(9, "Siva", 27);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(93);
        marks.add(87);
        marks.add(41);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student>{

    private int rollno;
    private String name;
    private int age;


    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//        return this.rollno-o.rollno;
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}


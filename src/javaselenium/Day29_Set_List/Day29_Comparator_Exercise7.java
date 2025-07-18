package javaselenium.Day29_Set_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day29_Comparator_Exercise7 {
    public static void main(String[] args) {

        Student1 s1 = new Student1(3, "Aswin", 27);
        Student1 s2 = new Student1(1, "Praveen", 24);
        Student1 s3 = new Student1(9, "Siva", 21);

        List<Student1> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList,new AgeComparator());
        System.out.println(studentList);
        Collections.sort(studentList,new NameComparator());
        System.out.println(studentList);
        Collections.sort(studentList,new RollNoComparator());
        System.out.println(studentList);

    }
}

class AgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()- o2.getAge();
    }
}

class NameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class RollNoComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getRollno()- s2.getRollno();
    }
}

class Student1{

    private int rollno;
    private String name;
    private int age;

    // Constructor, getters, setters, toString
    
    @Override
    public String toString() {
        return "Student1{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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


}

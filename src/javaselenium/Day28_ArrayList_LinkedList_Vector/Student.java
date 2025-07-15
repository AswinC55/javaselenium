package javaselenium.Day28_ArrayList_LinkedList_Vector;

public class Student {
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void print_details()
    {
        System.out.println("Student Name: " +this.name);
        System.out.println("Student Roll No: " +this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" + "name = '" + name + '\'' + ", rollNo='" + rollNo + '\''+ '}';
    }
}

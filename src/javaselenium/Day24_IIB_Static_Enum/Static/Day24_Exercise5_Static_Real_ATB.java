package javaselenium.Day24_IIB_Static_Enum.Static;

public class Day24_Exercise5_Static_Real_ATB {
    public static void main(String[] args) {

        ATB.zoomClass();
        ATB.doAssignment();
        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        System.out.println("---");
        ATB a1 = new ATB();
        a1.setName("Praveen");
        a1.setPhoneNo(123456);
        System.out.println(a1.getName());
        System.out.println(a1.getPhoneNo());

        System.out.println("---");
        ATB a2 = new ATB();
        a2.setName("Siva");
        a2.setPhoneNo(345679);
        System.out.println(a2.getName());
        System.out.println(a2.getPhoneNo());
        a2.howTheydoAssignment();
    }
}

class ATB{

    static{
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;   //non static
    private long phoneNo;  // non static
    static String courseName="ATB11X";
    static String mentorName="Pramod";


    static void doAssignment()
    {
        System.out.println("Assignmnet Doing");
    }

    static void zoomClass()
    {
        System.out.println("Class Joined");
    }

    void howTheydoAssignment()
    {
        System.out.println("Difference in doing Assignment");
    }

}

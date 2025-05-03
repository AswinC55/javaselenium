package javaselenium.Day24_IIB_Static_Enum.Enum;

public class Day24_Exercise7_Enum {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        Day1 d1 = new Day1();
        System.out.println(d1.Day1[4]);
        System.out.println(PROJECT_URLS.google);
    }
}
class Day1{

    String Day1[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum PROJECT_URLS{

    google, katalon, restassured, vwo
}
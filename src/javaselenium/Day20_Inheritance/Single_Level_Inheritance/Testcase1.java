package javaselenium.Day20_Inheritance.Single_Level_Inheritance;

public class Testcase1 extends Day20_Common_To_All{

    void running()
    {
        start_browser();
        System.out.println("Running TC2");
        read_excel_file();
        read_database_file();
        close_browser();
    }

}

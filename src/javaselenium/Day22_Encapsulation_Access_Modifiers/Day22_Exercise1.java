package javaselenium.Day22_Encapsulation_Access_Modifiers;

import java.security.PublicKey;
public class Day22_Exercise1 {
    public static void main(String[] args) {
        vwo_login vwlogin = new vwo_login("Praveen", "12345");
        System.out.println(vwlogin.username);
        System.out.println(vwlogin.password);
        vwlogin.username="Siva";
        vwlogin.password="56789";
        System.out.println(vwlogin.username);
        System.out.println(vwlogin.password);
        System.out.println("----");


        good_vwo_login vwlogin1 = new good_vwo_login("Lucky", "pwd123");
       // System.out.println(vwlogin1.username);
       // System.out.println(vwlogin1.password);

        vwlogin1.setUsername("Pramod");
        System.out.println(vwlogin1.getUsername());

        System.out.println(vwlogin1.getPassword());

        vwlogin1.setPassword("12345", false);
        System.out.println(vwlogin1.getPassword());

        vwlogin1.setPassword("34569", true);
        System.out.println(vwlogin1.getUsername());
        System.out.println(vwlogin1.getPassword());
    }
}

class vwo_login{

    public String username;
    public String password;

    vwo_login(String usr, String pass)
    {
        this.username=usr;
        this.password=pass;
    }
}

class good_vwo_login{

    private String username;
    private String password;

    public good_vwo_login(String usr, String pass)
    {
        this.username=usr;
        this.password=pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean admin) {
        if(admin)
        {
            this.password = password;
            System.out.println("Allowed to change Password");
        }
        else
        {
            System.out.println("Not allowed to change password");
        }
    }

}
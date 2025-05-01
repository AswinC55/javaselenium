package javaselenium.Day22_Encapsulation_Access_Modifiers;

public class Day22_Exercise2 {
    public static void main(String[] args) {

        Icici_Bank i1 = new Icici_Bank("Siva", "Pwd123");
        String password = i1.getPassword();
        System.out.println(password);
        System.out.println(i1.getName());
        System.out.println("-----");
        i1.setName("Pramod");
        System.out.println(i1.getName());
        i1.setPassword("12345", false);
        System.out.println(i1.getPassword());
        i1.setPassword("34569", true);
        String pass_updated= i1.getPassword();
        System.out.println(pass_updated);

    }
}

class Icici_Bank {

    private String name;
    private String password;

    public Icici_Bank(String name, String pass)
    {
        this.name=name;
        this.password=pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean clerk) {
        if(clerk){
            this.password = password;
            System.out.println("Able to change the value");
        }
        else{
            System.out.println("Not able to change");
        }
    }



}

package javaselenium.Day22_Encapsulation_Access_Modifiers.police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(int bullet){
        this.gun=bullet;

    }

    protected void canIshoot()
    {
        System.out.println("Yes, You can shoot");
    }

}

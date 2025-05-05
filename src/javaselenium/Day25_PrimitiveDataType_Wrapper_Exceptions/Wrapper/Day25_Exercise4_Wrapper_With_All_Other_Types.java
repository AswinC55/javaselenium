package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Wrapper;

public class Day25_Exercise4_Wrapper_With_All_Other_Types {
    public static void main(String[] args) {

        Mobile oneplus = new Mobile(1, "oneplus 15t", 39999.0);
        Mobile iPhone = new Mobile(2, "iPhone 15 Pro Max", 69999.0);

        iPhone.setPrice(99999.00);
        oneplus.display();
        iPhone.display();

        System.out.println(iPhone.getPrice());
        Mobile.switchOnAirplaneMode();


    }
}

class Mobile extends OldPhone{

    private Integer phone;
    private String name;
    private Double price;
    static String mobile_career = "airtel";

    Mobile()
    {
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display()
    {
        System.out.println(this.name+this.price+this.phone);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price)
    {
        System.out.println("Change Price in Integers");
    }

    void priceChange(Double price)  //Overloading
    {
        System.out.println("Change Price in Double");
    }


    @Override
    void calling()
    {
        System.out.println("Dialpad-> Touch Dialpad now");
    }

    @Override
    public void enterCard() {
        System.out.println("Card Removed");
    }
}

class OldPhone implements SIMCard{

    void calling()
    {
        System.out.println("Dialpad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card Entered");
    }
}


interface SIMCard{
    void enterCard();
}
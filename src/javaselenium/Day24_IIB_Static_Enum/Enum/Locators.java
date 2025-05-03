package javaselenium.Day24_IIB_Static_Enum.Enum;

public enum Locators {

    page_button("#btn"),
    page_input("#input1");

    private String locators;

    Locators(String locators)
    {
        this.locators=locators;
    }

    String getLocators(){
        return this.locators;
    }

}

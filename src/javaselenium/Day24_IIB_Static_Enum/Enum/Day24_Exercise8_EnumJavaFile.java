package javaselenium.Day24_IIB_Static_Enum.Enum;

public class Day24_Exercise8_EnumJavaFile {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("---");

        System.out.println(Colours.RED.getHexCode());
        System.out.println(Colours.GREEN.getHexCode());
        System.out.println(Colours.YELLOW.getHexCode());
        System.out.println(Colours.BLUE.getHexCode());

        System.out.println("---");

        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());
        System.out.println(APIURLs.GOOGLE.getUrl());
    }
}

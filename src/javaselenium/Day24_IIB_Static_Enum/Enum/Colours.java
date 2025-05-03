package javaselenium.Day24_IIB_Static_Enum.Enum;

public enum Colours {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    Colours(String hexCode)
    {
        this.hexCode=hexCode;
    }

    String getHexCode()
    {
        return this.hexCode;
    }
}

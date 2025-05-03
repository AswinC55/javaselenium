package javaselenium.Day24_IIB_Static_Enum.Enum;

public enum APIURLs {

    katalon("https://katalon.com"),
    vwo("https://app.vwo.com"),
    GOOGLE("https://google.com");

    private String url;

    APIURLs(String a)
    {
        this.url=a;
    }

    String getUrl()
    {
        return this.url;
    }
}

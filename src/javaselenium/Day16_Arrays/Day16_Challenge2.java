package javaselenium.Day16_Arrays;

public class Day16_Challenge2 {
    public static void main(String[] args) {

        int[] num = {1,2,3,99,66};
        int largest =num[0];
        int second_largest=0;

        for(int i=0; i<=num.length-1; i++)
        {
            if(num[i]>largest)
            {
                largest= num[i];
            }
            else if (num[i]!=largest || num[i]>second_largest)
            {
                second_largest=num[i];
            }
        }

        System.out.println("Largest- "+largest);
        System.out.println("Second Largest- "+second_largest);
    }
}

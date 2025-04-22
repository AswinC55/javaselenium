package javaselenium.Day16_Arrays;

public class Day16_Challenge1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,99,66};
        int odd_count=0;
        int even_count=0;

        for(int i=0; i<=num.length-1; i++)
        {
            if(num[i]%2==0)
            {
                even_count=even_count+1;
                System.out.println("The number "+num[i]+ " is Even");
            }

            else
            {
                odd_count=odd_count+1;
                System.out.println("The number "+num[i]+ " is Odd");
            }
        }
        System.out.println("Odd Count is "+odd_count);
        System.out.println("Even Count is "+even_count);

    }
}

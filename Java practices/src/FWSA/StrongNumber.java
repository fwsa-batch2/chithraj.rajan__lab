package FWSA;

import java.util.Scanner;
public class StrongNumber {
    
    public static void main(String [] args) 
    {
        int number, sum = 0, remainder, temporary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        number = sc.nextInt();
        temporary = number ;
        while(number>0)
        {
            remainder = number % 10;
            int fact = 1;
            for (int i=1; i<remainder; i++)
            {
                fact = fact*i;
            }
            number = number/10;
            sum = sum+fact;
        }
        if(temporary==sum)
            System.out.println(sum+"Number is strong");
        else
        System.out.println(sum+"Number is not strong");
    }
}

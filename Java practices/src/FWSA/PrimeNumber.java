package FWSA;

import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int number , i, count = 0;
        Scanner s = new Scanner(System.in);
        

        System.out.print("Enter Any number: ");
        number =s.nextInt();

        for (i=2; i<number ; i++)
        {
            if (number%i ==0)
            {
                count++;
                break;
            }
        }

        if(count ==0)
            System.out.println("\n It is A Prime Number.");
        else
        System.out.println("\n It is not A Prime Number.");
    }
}

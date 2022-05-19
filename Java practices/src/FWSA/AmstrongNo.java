package FWSA;

public class AmstrongNo {
    
    public static void main(String[] args) {
        
        int number = 152 , realnumber, remainder, result = 0 ,n = 0;

        realnumber = number;

        for (;realnumber != 0; )
{
    realnumber /= 10 ;  // 152 = 15  |  15 = 1  |  1 = 0
    ++n; // 1  2  3
}
System.out.println("Numeber "+n);
        

    //     for (;realnumber != 0; realnumber /= 10 )
    //     {
    //         remainder = realnumber % 10 ;
    //         result += Math.pow (remainder, n);
    //     }

    //     if(result == number)
    //         System.out.println(number + "is Amstrong Number.");

    //     else
    //         System.out.println(number + "is not Amstrong Number.");
    // }
}}

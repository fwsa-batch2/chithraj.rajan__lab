package FWSA;

public class Ex_fibonnaci {
    public static void main(String args[]) 
    {
        int number1 = 0, number2 = 1, number3, i, count = 15;
        System.out.println(number1 + " " + number2); //adding or printing 0 and 1

        for(i=2;i<count;++i)
        //because loop starts from 2
        {
             number3 = number1 + number2;
             System.out.print(" "+number3);
             number1 = number2 ;
             number2 = number3 ;
        }
    }
}

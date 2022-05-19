import java.util.Scanner;
public class assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check year leap year are not : ");
        int year =  sc.nextInt();
        if(year % 4 ==0){
            System.out.println(year +"is a leap year");
        }
        else{
            System.out.println(year +"is not a leap year");
        }
    }
}

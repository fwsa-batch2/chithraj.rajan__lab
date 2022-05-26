package FWSA;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);

        int a = integer.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.println(a*i);
            for (int j = 2;j<=30;j++){
                System.out.println(j);
            }
        }

       String[] chit={"kasi","anto"};
        for (String i:chit){
            System.out.println(i);
        }

        while(chit != null){

        }
    }
}

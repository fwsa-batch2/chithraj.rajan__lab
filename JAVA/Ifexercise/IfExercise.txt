package FWSA;

import java.util.*;

public class IfExercise {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (1<=N && 100>=N){
            if(N%2==1 || N%2==0 && 6<=N && 20>=N){
                System.out.println("Werid");
            }
            else{
                System.out.println("Not Werid");
            }
        }

    }
}

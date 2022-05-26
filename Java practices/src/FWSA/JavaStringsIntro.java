package FWSA;

import java.io.*;
import java.util.*;

public class JavaStringsIntro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int C = A.length();
        int D = B.length();
        System.out.println(C+D);
        int i = A.compareTo(B);
        if(i>0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
//        System.out.println(A.toUpperCase(0,1) + " " + B.toUpperCase(0,1));
        String E = A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        String F = B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();

        System.out.println(E+" " +F);
    }
}

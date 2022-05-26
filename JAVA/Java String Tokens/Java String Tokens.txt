package FWSA;
import java.io.*;
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String arr[] = s.split("[^a-zA-Z]+");
        System.out.println(arr.length);
        for (String i:arr){
            System.out.println(i);

        }

        scan.close();
    }}


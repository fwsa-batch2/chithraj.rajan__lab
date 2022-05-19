package FWSA;

import java.util.*;
public class Average 
{
 public static void main(String args[]) {    
     int sum = 0,avg;
     ArrayList <Integer> list = new ArrayList<Integer>();
     //adding values

     list.add(34);
     list.add(67);
     list.add(89);
     list.add(12);
     list.add(23);

     //for loop
     for (int i=0;i<list.size();i++)
     sum = sum + list.get(i);
     avg = sum / list.size();
     System.out.println("Average of this values :" +avg);

 }   
}

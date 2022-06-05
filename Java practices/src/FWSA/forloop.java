package FWSA;
import java.io.*;
import java.util.HashMap;
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



















































































































































































































package FWSA;
        import java.util.*;
        import java.lang.*;
        import java.io.*;

class user implements Serializable {
    public HashMap<Integer,String> hp=new HashMap<>();
}

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        FWSA.user name = new FWSA.user();
        name.hp.put(1,"chith");
        name.hp.put(2,"kasi");
        try {
            FileOutputStream fpo = new FileOutputStream("D:\\chith.txt");
            ObjectOutputStream oop = new ObjectOutputStream(fpo);
            oop.writeObject(name);
            oop.close();
            fpo.close();
            System.out.println("finished");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}




















































































































//reverse array


// Reversing an array using Java collections
import java.util.*;

public class reversingArray {

    // function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}



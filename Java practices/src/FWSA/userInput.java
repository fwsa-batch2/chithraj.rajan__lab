package FWSA;

import java.util.Scanner;

//getting input from user
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name :");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

        System.out.println("Enter Your age" + " :");
        int age = scanner.nextInt();
        System.out.println("your age is"+ " " + age);

        System.out.println("Enter Your email" + " :");
        String email = scanner.nextLine();
        System.out.println("is"+ email+ "yours ?" );

        System.out.println("Thank you");
    }
}

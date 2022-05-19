package FWSA;

public class Calculato {

    static int number1 = 1;
    static int number2 = 2;

    public static void main(String[] args) {
        int add = addition(number1, number2);
        System.out.println("the sum of the values is " + add);
        int sub = subration(number1, number2);
        System.out.println("the difference of the values is " + sub);
        int prod = product(number1, number2);
        System.out.println("the product of the values is " + prod);
        int div = quotiont(number1, number2);
        System.out.println("the division of the values is " + div);
    }

    public static int addition(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int subration(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    public static int product(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    public static int quotiont(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

}

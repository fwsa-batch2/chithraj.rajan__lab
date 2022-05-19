public class BoolWrapper {
    public static void main(String[] args) {
        //autoboxing
        boolean a = true;
        Boolean objA = a;
        System.out.println("primitive to object " + objA);

        //unboxing
        Boolean objB = false;
        boolean b = objB;
        System.out.println("object to primitive " + b);
    }
}

public class IntergerWrapper {
    public static void main(String[] args) {
        //autoboxing
        int a = 20;
        Integer myobj = a;
        System.out.println("primitive to object " + myobj);

        //unboxing
        Integer obj = 30;
        int integer = obj;
        System.out.println("object to primitive " + integer);

    }
}

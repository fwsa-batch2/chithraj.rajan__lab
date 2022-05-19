public class FloatWrapper {
    public static void main(String[] args) {

        //autoboxing
        float a = 20.22F;
        Float myobj = a;
        System.out.println("primitive to object " + myobj);

        //unboxing
        Float obj = 30.33F;
        float myfloat = obj;
        System.out.println("object to primitive " + myfloat);


    }

}


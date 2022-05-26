package FWSA;

public class singleton1 {
    private static singleton1 singleton;
    private singleton1(){
    }
    public static singleton1 getInstance(){
        if(singleton == null){
            singleton=new singleton1();
        }
        return singleton;
    }
    public static void print(String name) {
        System.out.println("Your best friend is :"+name);
    }
}

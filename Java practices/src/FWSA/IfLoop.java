package FWSA;

public class IfLoop {
    public static void main(String[] args) {

        int run = 50 ;

        if (run<50){
            System.out.println("Good Player");
        }
        else if (run == 50) {
            System.out.println("Half century");
        }
        else if (run > 50) {
            System.out.println("Century is near...Keep it up");
        }
        else {
            System.out.println("Fire is on");
        }

        int a = 1;
        switch (a){
            case 0:
                System.out.println("it is zero");
                break;
            case 1:
                System.out.println("it is one");
                break;
            case 2:
                System.out.println("it is two");
                break;
            default:
                System.out.println("please enter any number");
                break;

        }

    }
}

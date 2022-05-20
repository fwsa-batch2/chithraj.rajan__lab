package FWSA;

public class Threads extends Thread {
    public void run(){
        System.out.println("Hey Chithu");
    }

    public static void main(String[] args) {
        Threads myobj = new Threads();
        myobj.start();
    }
}

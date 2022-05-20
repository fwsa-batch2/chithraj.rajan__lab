package FWSA;

public class ThreadRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hey Chith");
    }

    public static void main(String[] args) {
        Thread myobj = new Thread (new ThreadRunable());
        myobj.run();
    }
}

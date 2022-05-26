package FWSA;

public class singleton1main {
    public static void main(String[] args) {
        singleton1 Chithu = singleton1.getInstance();
        Chithu.print("Kasi");
        System.out.println(Chithu);
        singleton1 Kasi = singleton1.getInstance();
        Kasi.print("Chithu");
        System.out.println(Kasi);
    }
}

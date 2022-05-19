import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int one = obj.nextInt();
        int two = obj.nextInt();
        int three = obj.nextInt();
        int [] sample = {one,two,three};
        int big = sample[0];
        for (int j : sample) {
            if (big < j) {
                big = j;
            }
        }
        System.out.println(big+" is the largest number");
    }
}

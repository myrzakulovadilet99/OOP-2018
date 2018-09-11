import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int k = 0;
        while (true) {
            if (Math.pow(2, k) > a) {
                break;
            }
            System.out.print((int) Math.pow(2, k) + " ");
            k++;
        }
    }
}

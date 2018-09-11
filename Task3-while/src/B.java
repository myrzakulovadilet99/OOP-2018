import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int k = 2;
        while (true) {
            if (a % k == 0) {
                System.out.println(k);
                break;
            }
            k++;
        }

    }
}

import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        for (int i = (a - c + d - 1) / d; i * d + c <= b; i++) {
            System.out.print(i * d + c + " " + "");
        }
    }

}

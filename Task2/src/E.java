import java.util.Scanner;
public class E {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.print("1");
        }
        if (a < b) {
            System.out.print("2");
        }
        if ( a == b) {
            System.out.print("0");
        }

    }

}

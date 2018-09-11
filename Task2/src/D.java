import java.util.Scanner;
public class D
{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a > 0 ){
            System.out.print("1");
        }
        if (a == 0) {
            System.out.print("0");
        }
        if ( a < 0 ) {
            System.out.print("-1");
        }

    }
}

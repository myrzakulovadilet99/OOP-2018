import java.util.Scanner;
public class A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ( a > b ) {
            System.out.print(a);
        }
         else {
            System.out.print(b);
        }
    }

}

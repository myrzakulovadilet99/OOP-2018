import java.util.Scanner;
public class D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (b%a);
        System.out.print(c);
    }

}

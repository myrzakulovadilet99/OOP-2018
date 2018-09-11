import java.util.Scanner;
public class B {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

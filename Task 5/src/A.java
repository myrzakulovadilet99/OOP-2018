import java.util.Scanner;
public class A {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.print(func(func(a,b), func(c,d)));

    }

   static int func(int a, int b){
        if (a > b){
            return b;
        }
        return a;
    }


}

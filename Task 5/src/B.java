import java.util.Scanner;
public class B {
    public static int func(int a, int b){
        int k = 1;
        for (int i =0; i < b; i++){
            k *= a;
        }
        return k;
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print(func(a,b));
    }


}

import java.util.Scanner;
public class C {
    static int func(int x, int y) {
        if (x != y) {
            return 1;
        } else {
            return 0;
        }
    }
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int a = input.nextInt();
   int b = input.nextInt();
   System.out.print(func(a,b));
}


}

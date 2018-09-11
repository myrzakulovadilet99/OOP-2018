import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 2; i <= a; i++){
            if (a % i == 0){
                System.out.print(i);
                break;
            }
        }
    }
}

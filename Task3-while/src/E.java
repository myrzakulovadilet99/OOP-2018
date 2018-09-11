import java.util.Scanner;

public class E {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int a = 0;
        int c = 1;
        while (c < k){
            c *= 2;
            a++;

        }
        System.out.println(a);
    }
}

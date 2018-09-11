import java.util.Scanner;
public class D {
    static int bool(int x, int y, int z) {
        if (x == y && y == z && x ==z) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int z = input.nextInt();
        System.out.print(bool(a, b, z));
    }

}

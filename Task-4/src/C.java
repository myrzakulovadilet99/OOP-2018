import java.util.Scanner;
public class C {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++){
            if(a[i] > 0 ){
                k++;
            }
        }
        System.out.print(k);
    }
}

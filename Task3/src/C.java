import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=1;i*i<=b;i++){
            if(i*i>=a)
            {
                System.out.print(i*i+" ");
            }
            else{
                System.out.print(" ");
            }
        }

    }
}

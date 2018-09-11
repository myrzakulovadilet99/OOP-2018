import java.util.Scanner;
public class A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int k = 1;
        while(true){
            if (k * k > a){
                break;
            }
            System.out.println(k*k  + " " + " ");
            k++;
        }
    }


}

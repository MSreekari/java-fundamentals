package recursion;
import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printOneToN(1, 5);

    }
    public static void printOneToN(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printOneToN(i+1, n);
    }
}

package recursion.backtracking;
import java.util.Scanner;

public class PrintFromOneToN {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printFromOneToN(5, 5);
    }
    public static void printFromOneToN(int i, int n) {
        if(i < 1){
            return;
        }
        printFromOneToN(i-1, n);
        System.out.println(i);
    }
}

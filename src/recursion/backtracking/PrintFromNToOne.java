package recursion.backtracking;
import java.util.Scanner;

public class PrintFromNToOne {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printNToOne(1, 5);
    }
    public static void printNToOne(int i, int n) {
        if(i > n){
            return;
        }
        printNToOne(i + 1, n);
        System.out.println(i);
    }
}

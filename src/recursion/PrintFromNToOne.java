package recursion;
import java.util.Scanner;

public class PrintFromNToOne {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printNToOne(5, 5);
    }
    public static void printNToOne(int i, int n) {
        if(i < 1){
            return;
        }
        System.out.println(i);
        printNToOne(i - 1, n);
    }
}

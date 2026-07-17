package recursion;
import java.util.*;

public class PrintName {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printName(1, 5);
    }
    public static void printName(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Recursion");
        printName(i + 1, n);
    }
}

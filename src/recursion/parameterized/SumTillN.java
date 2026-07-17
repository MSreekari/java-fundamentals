package recursion.parameterized;
import java.util.*;

public class SumTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        printSumTillN(n, sum);
    }
    public static void printSumTillN(int i, int sum) {
        if(i < 1){
            System.out.println(sum);
            return;
        }
        printSumTillN(i-1, sum + i);
    }
}

package recursion.functional;
import java.util.*;

public class SumTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumTillN(n));
    }
    public static int sumTillN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumTillN(n - 1);
    }
}

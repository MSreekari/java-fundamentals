package Collections;

import java.util.PriorityQueue;

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {12, 10, -1, 0, -2, 100};
        int n = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        System.out.println(pq);
        for(int i = n; i > 0; i--){
            pq.poll();
        }
        System.out.println(pq);
    }
}

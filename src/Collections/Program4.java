package Collections;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {100, 40, -1, 12, 50, 16};
        int element = -1;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(element == arr[i]) {
                found = true;
            }
        }
        if(found){
            System.out.println(found);
        }else{
            System.out.println("Not found");
        }
    }
}

package DynamicProgramming.potd_aug_1.recursion;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2};
        System.out.println(predictTheWinner(nums));
    }
    public static boolean predictTheWinner(int[] nums){
        int result = f(nums, 0, nums.length - 1);
        return result >= 0;
    }
    public static int f(int[] nums, int i, int j){
        if(i == j) return nums[i];
        int pickLeft = nums[i] - f(nums, i + 1, j);
        int pickRight = nums[j] - f(nums, i, j - 1);
        int max = Math.max(pickLeft, pickRight);
        return max;
    }
}

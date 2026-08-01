package DynamicProgramming.potd_aug_1.memoization;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2};
        System.out.println(predictTheWinner(nums));
    }
    public static boolean predictTheWinner(int[] nums){
        Integer[][] dp = new Integer[nums.length][nums.length];
        int result = f(nums, 0, nums.length - 1, dp);
        return result == 0;
    }
    public static int f(int[] nums, int i, int j, Integer[][] dp){
        if(i == j) return nums[i];
        if(dp[i][j] != null) return dp[i][j];
        int pickLeft = nums[i] - f(nums, i + 1, j, dp);
        int pickRight = nums[j] - f(nums, i, j - 1, dp);
        return Math.max(pickLeft, pickRight);
    }
}

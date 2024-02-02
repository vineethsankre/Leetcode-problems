class Solution {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int maxSoFar = nums[0];
        int curMax = nums[0];
        
        for (int i = 1; i<N; i++){
            curMax = Math.max(nums[i], nums[i] + curMax);
            maxSoFar = Math.max(curMax, maxSoFar);
        }
        return maxSoFar;

    }
}
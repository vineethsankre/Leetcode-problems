class Solution {
    public int search(int[] nums, int target) {
        int N = nums.length;

        
        for (int i = 0; i<N; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
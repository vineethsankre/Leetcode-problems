class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        int left = 0;
        int right = N - 1;
        
        while (left < right){
            int mid = (left  + right) / 2;
            
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        return nums[left];
        
    }
}
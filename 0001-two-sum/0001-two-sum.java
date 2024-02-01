import java.util.*;

class Solution {
    // Function to find two numbers in the array that sum up to the target
    public int[] twoSum(int[] nums, int target) {
        // Get the length of the array
        int n = nums.length;
        
        // Create a HashMap to store the elements and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Array to store the result indices
        int[] result = new int[2];
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Calculate the complement (target - current element)
            int complement = target - nums[i];
            
            // Check if the complement is present in the HashMap
            if (map.containsKey(complement)) {
                // If found, set the result indices and return
                result[1] = i;  // Current index
                result[0] = map.get(complement);  // Index of the complement
                return result;
            }
            
            // If complement is not found, add the current element and its index to the HashMap
            map.put(nums[i], i);
        }
        
        // If no such pair is found, return the default result array (it will contain zeros)
        return result;
    }

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    
    boolean even(int num){
        int numOfDigits = numOfDigits(Math.abs(num));
        return numOfDigits % 2 == 0;
    }
    
    int numOfDigits(int num){
        return (int)(Math.log10(num)) + 1;
    }
    
}
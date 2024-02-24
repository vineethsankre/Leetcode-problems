class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // Calculate sum without considering carry
            int sumWithoutCarry = a ^ b;
            
            // Calculate carry
            int carry = (a & b) << 1;
            
            // Update a with sumWithoutCarry and b with carry
            a = sumWithoutCarry;
            b = carry;
        }
        return a;
    }
}
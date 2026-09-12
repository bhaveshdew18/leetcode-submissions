class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int index = n - 1; // Start filling result from the back
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++; // Move the left pointer inward
            } else {
                result[index] = rightSquare;
                right--; // Move the right pointer inward
            }
            index--; // Move down to the next largest spot
        }
        
        return result;
    }
}

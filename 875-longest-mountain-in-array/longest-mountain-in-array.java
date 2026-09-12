class Solution {
    public int longestMountain(int[] nums) {
        int n = nums.length;
        int maxlen = 0;
        if(n < 3) return 0;

        for(int i = 1; i < n - 1; i++) {
            if(nums[i] > nums[i - 1] && nums[i + 1] < nums[i]) {
               int left = i;
               int right = i;

                while (left > 0 && nums[left] > nums[left - 1]) {
                left--;
            }

            while (right < n - 1 && nums[right] > nums[right + 1]) {
                right++;
            }

            int currlen = right - left + 1;
            maxlen = Math.max(currlen,maxlen);
            }  
        }

        return maxlen;
    }
}
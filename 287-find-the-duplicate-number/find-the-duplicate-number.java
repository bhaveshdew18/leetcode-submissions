class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        int r = 1;
        int ans = 0;
        while(r < nums.length) {
            if(nums[r] == nums[r - 1]) {
                ans = nums[r];
            }
            r++;
        }

        return ans;

    }
}
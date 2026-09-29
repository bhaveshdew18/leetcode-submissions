class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int req = target - nums[i];

            if(sum.containsKey(req)) {
                return new int[]{
                    sum.get(req), i
                };
            }

            sum.put(nums[i], i);
        }

        return new int[]{};
    }
}
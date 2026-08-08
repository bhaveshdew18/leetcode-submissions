class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mapindex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(mapindex.containsKey(nums[i])) {
                int distance = Math.abs(i - mapindex.get(nums[i]));
                if(distance <= k) {
                    return true;
                }
            }
            mapindex.put(nums[i], i);
        }
        return false;
    }
}
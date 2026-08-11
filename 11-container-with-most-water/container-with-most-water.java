class Solution {
        public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = Math.min(heights[left],heights[right]) * (right - left);
        
        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left],heights[right]);
            int currentArea = height * width;
            if(heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
            
            area = Math.max(area,currentArea);
        }
        return area;
    }
}
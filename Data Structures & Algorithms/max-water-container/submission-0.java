class Solution {
    public int maxArea(int[] heights) {
        int low = 0;
        int high = heights.length - 1;
        int ans = 0;

        while(low < high) {
            if(heights[low] <= heights[high]) {
                ans = Math.max(ans, heights[low] * (high - low));
                low++;
            } else {
                ans = Math.max(ans, heights[high] * (high - low));
                high--;
            }
        }
        return ans;
    }
}

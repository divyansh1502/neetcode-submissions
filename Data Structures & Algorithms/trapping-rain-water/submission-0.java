class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        int maxWater = 0;

        while(start < end) {
            if(height[start] <= height[end]) {
                if(height[start] >= leftMax) {
                    leftMax = height[start];
                } else {
                    maxWater += leftMax - height[start];
                }
                start++;
            } else {
                if(height[end] >= rightMax) {
                    rightMax = height[end];
                } else {
                    maxWater += rightMax - height[end];
                }
                end--;
            }
        }
        return maxWater;
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        int[] newArr = new int[nums.length];
        for(int i = k; i >= 0; i--) {
            int lSqr = nums[left] * nums[left];
            int rSqr = nums[right] * nums[right];

            if(lSqr > rSqr) {
                newArr[i] = lSqr;
                left++;
            } else {
                newArr[i] = rSqr;
                right--;
            }
        }
        return newArr;
    }
}
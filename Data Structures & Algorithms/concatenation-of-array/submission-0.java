class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length + nums.length;
        int[] newArr = new int[n];
        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
            newArr[nums.length + i] = nums[i];
        }
        return newArr;
    }
}
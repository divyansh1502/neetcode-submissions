class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = binarySearch(nums, target, true);
        if(arr[0] == -1) {
            return new int[]{-1, -1};
        }
        arr[1] = binarySearch(nums, target, false);

        return arr;
    }
    int binarySearch(int[] nums, int target, boolean searchFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
            else {
                ans = mid;
                if(searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
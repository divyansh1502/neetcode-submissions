class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;

        int[] first = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] second = sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeArray(first, second);
    }
    int[] mergeArray(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] <= second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        while(i < first.length) {
            mix[k++] = first[i++];
        }
        while(j < second.length) {
            mix[k++] = second[j++];
        }
        return mix;
    }
}
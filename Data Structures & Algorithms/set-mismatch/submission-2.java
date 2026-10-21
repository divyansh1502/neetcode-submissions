class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int missing = -1;
        int duplicate = -1;
        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) {
                duplicate = nums[i];
            }
        }
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                missing = i;
            }
        }
       return new int[]{duplicate, missing};
        // int[] arr = new int[2];
        // int i = 0;
        // while(i < nums.length) {
        //     int correct = nums[i] - 1;
        //     if(nums[i] != nums[correct]) {
        //         int temp = nums[i];
        //         nums[i] = nums[correct];
        //         nums[correct] = temp;
        //     } else {
        //         i++;
        //     }
        // }
        // for(int j = 0; j < nums.length; j++) {
        //     if(nums[j] != j + 1) {
        //         arr[0] = nums[j];
        //         arr[1] = j + 1;
        //     }
        // }
        // return arr;
    }
}
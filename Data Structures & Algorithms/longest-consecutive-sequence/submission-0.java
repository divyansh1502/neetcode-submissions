class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num : nums) {
            set.add(num);
        }

        for(int num : nums) {
            int count = 1;
            if(set.contains(num - 1)) continue;
            else {
                while(set.contains(num + 1)) {
                    num++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}

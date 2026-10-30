class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        pq.addAll(map.keySet());
        int counter = 0;

        while(!pq.isEmpty()) {
            if(counter < k) {
                nums[counter++] = pq.poll();
            }
            if(counter == k) {
                break;
            }

        }
        return Arrays.copyOfRange(nums, 0, counter);
    } 
}

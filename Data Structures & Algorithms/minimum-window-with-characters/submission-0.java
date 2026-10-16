class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int right = 0;
        int left = 0;
        int startIndex = -1;
        int count = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        while(right < s.length()){
            if(map.getOrDefault(s.charAt(right), 0) > 0) {
                count++;
            }
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) - 1);

            while(count == t.length()) {
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) + 1);
                if(map.getOrDefault(s.charAt(left) , 0) > 0) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex, (startIndex + minLen));
    }
}

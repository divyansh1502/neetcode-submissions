class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int right = 0;
        int left = 0;
        int maxLen = 0;
        int ans = -1;

        while(right < s.length()) {
            freq[s.charAt(right) - 'A']++;

            maxLen = Math.max(maxLen, freq[s.charAt(right) - 'A']);
            int windowSize = right - left + 1;
            int replacement = windowSize - maxLen;

            while(replacement > k) {
                freq[s.charAt(left) - 'A']--;
                left++;

                windowSize = right - left + 1;
                replacement = windowSize - maxLen;
            }
            right++;
            ans = Math.max(ans, windowSize);
        }
        return ans;
    }
}

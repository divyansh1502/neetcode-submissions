class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String a = strs[0];
        String b = strs[strs.length - 1];

        int index = a.length();

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                index = i;
                break;
            }
        }
        return a.substring(0, index);
    }
}
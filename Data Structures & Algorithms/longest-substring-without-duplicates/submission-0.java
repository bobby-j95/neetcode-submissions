class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cArray = s.toCharArray();
        int ans = 0, l = 0;
        Set<Character> seen = new HashSet<>();

        for(int r = 0; r < s.length(); r++){
            while(seen.contains(cArray[r])){
                seen.remove(cArray[l]);
                l++;
            }
            seen.add(cArray[r]);
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            for (char c : s.toCharArray()){
                t = t.replaceFirst(String.valueOf(c), "");
            }
        } else {
            return false;
        }
        return t.isEmpty();
    }
}

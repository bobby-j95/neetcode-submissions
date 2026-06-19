class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] cArray= s.toCharArray();
        while (r > l){
            if (!Character.isLetterOrDigit(cArray[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(cArray[r])) {
                r--;
                continue;
            }
            if (Character.toLowerCase(cArray[l]) != Character.toLowerCase(cArray[r])) return false;
            l++;
            r--;
        }
        return true;
    }
}
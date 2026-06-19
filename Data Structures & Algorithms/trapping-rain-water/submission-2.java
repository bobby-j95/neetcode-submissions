class Solution {
    public int trap(int[] height) {
        
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, result = 0;
        int r = height.length - 1;

        int lMax = height[l];
        int rMax = height[r];

        while (l < r){
            if (lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                result = result + (lMax - height[l]);
            } else{
                r--;
                rMax = Math.max(rMax, height[r]);
                result = result + (rMax - height[r]);
            }
        }
        return result;
    }
}

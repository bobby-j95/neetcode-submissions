class Solution {
    public int maxArea(int[] heights) {
        int ans = 0, n = heights.length, j = heights.length - 1;
        int i = 0;
        while(i < j){
            int width = j - i, height = Math.min(heights[i], heights[j]);
            ans = Math.max(ans, (width * height));

            if(heights[i] < heights[j]){
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }
}

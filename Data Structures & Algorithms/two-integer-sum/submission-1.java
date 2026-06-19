class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int y = 1;

        while (y < nums.length){
            for (int x = 0; x < nums.length; x++){
                if (x != nums.length && y == nums.length)
                    y = 1;
                if (nums[x] + nums[y] == target){
                    int[] sumValue = {x,y};
                    Arrays.sort(sumValue);
                    return sumValue;
                }
                
                y++;
            }
        }
        return null;
    }
}

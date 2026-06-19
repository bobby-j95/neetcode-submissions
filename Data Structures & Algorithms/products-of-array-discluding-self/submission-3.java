class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int[] val = new int[nums.length];
        while (i < nums.length){
            int total = 1;
            for (int x = 0; x < nums.length; x++){
                if (i != x){
                    total *= nums[x];
                }
            }
            val[i] = total;
            i++;
        }
        return val;
    }
}  

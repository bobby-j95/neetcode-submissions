class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> lArray = new ArrayList<>();
        int[] val = new int[nums.length];
        
        /*nested for loop to get values of all products that isn't nums[x] values
          all nums[y] values are multiplied together*/
        for (int x = 0; x < nums.length; x++){
            int product = 1;
            for (int y = 0; y < nums.length; y++){
                 if (x != y) {
                    product *= nums[y];
                }
            }
            val[x] = product;
        }

        return val;
    }
}  

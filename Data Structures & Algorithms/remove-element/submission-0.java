class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for (int y = 0; y < nums.length; y++){
            if (nums[y] != val){
                nums[x] = nums[y]; 
                System.out.println(x + " ; " + y);
                System.out.println(nums[x] + " : " + nums[y]);
                x++;
            }
        }
        return x;
    }
}
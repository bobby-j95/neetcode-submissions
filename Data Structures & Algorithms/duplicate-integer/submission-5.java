class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean checker = false;
        int y = 1;
        if (nums.length == 1)
            return checker;
        for (int x = 0; x < nums.length; x++){
            while (y <= nums.length){
                if(y + 1 != nums.length+1)
                    if (nums[x] == nums[y]){
                        checker = true;
                        break;
                    }
                y++;
            }
            if(x + 1 == nums.length){
                if (nums[x] == nums[x - 1])
                        checker = true;
            }
            y = x+2;
        }
        return checker;
    }
}
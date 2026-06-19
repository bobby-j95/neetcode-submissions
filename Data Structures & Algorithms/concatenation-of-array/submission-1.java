class Solution {
    public int[] getConcatenation(int[] nums) {
         int newSize = nums.length * 2;
         int[] newArray = new int[newSize];
         int y = 0;
         for (int x = 0; x < newArray.length; x++){
            newArray[x] = nums[y];
            y++;
            if(x == nums.length - 1)
                y = 0;
         }
         return newArray;
    }
}
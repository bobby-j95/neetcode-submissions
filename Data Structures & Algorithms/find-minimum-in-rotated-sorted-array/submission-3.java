class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;

        int result = nums[0];

        while (nums[i] > nums[j]){
    
            int mid = (i + j) / 2;

            if(nums[mid] < nums[i]){
                result = nums[mid];
                j = mid;
            }

            else if(nums[mid] >= nums[i]){
                i = mid + 1;
                result = nums[i];
            }

        }

        return result;
    }

}
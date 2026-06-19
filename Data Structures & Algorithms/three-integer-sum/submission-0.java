class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> val = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            int l = i + 1, r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if(sum == 0){
                    val.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++; 
                    r--;
                    continue;
                }
                if(sum < 0){
                    l++;
                    continue;
                }
                if(sum > 0){
                    r--;
                    continue;
                }

            }
        }
        return val;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return 0;
        
        // int len = 1;
        // Arrays.sort(nums);
        // System.out.println("sorted array: " + Arrays.toString(nums));
        // for(int i = 1; i < nums.length; i++){
        //     if((nums[i] - 1) == nums[i - 1]){
        //         len++;
        //     }
        // }

        int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0, curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}

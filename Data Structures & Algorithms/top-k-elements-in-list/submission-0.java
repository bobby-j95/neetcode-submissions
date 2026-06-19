class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        // After counting frequenies in the map...
        List<Integer>[] buckets = new List[nums.length + 1];

        // Initialize buckets
        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        // Put numbers in buckets based on frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        // Collect top k from highest frequency buckets
        int[] result = new int [k];
        int index = 0;
        for (int x = buckets.length - 1; x >= 0 && index < k; x--){
            for(int y : buckets[x]) {
                result[index++] = y;
                if (index == k) return result;
            }
        }

        return null;
    }
}

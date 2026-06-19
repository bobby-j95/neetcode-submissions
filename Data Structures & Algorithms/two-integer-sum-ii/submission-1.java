class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x = 0, y = numbers.length - 1;

        while (x != y){
            if (numbers[x] + numbers[y] > target){
                y--;
                continue;
            }
            if (numbers[x] + numbers[y] < target){ 
                x++;
                continue;
            }
            return new int[] {++x, ++y};
        }

        return null;
    }
}

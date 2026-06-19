class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1, j = Arrays.stream(piles).max().getAsInt();
        int result = j;

        while(i <= j){
            int mid = (i + j) / 2;

            long totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double) p / mid);
            }

            if(totalTime <= h){
                result = mid;
                j = --mid;
            } else {
                i = ++mid;
            }
        } 

        return result;
    }
}

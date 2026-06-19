class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer> tStack = new Stack<>();
      int tempLength = temperatures.length;
      int[] ans = new int[tempLength];

      for(int x = tempLength - 1; x >= 0; x--){

        while(!tStack.isEmpty() && temperatures[x] >= temperatures[tStack.peek()]){
          tStack.pop();
        }
        
        if(!tStack.isEmpty()){
          ans[x] = tStack.peek() - x;
        }
        
        tStack.push(x);
      }

      return ans;
    }
}

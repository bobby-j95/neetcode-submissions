class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer>  tempStack = new Stack<>();
      int i = temperatures.length;
      int[] ans = new int[i];

      for (int x = i - 1; x >= 0; x--){
        while(!tempStack.isEmpty() && temperatures[x] >= temperatures[tempStack.peek()]){
            tempStack.pop();
        }

        if(!tempStack.isEmpty()){
            ans[x] = tempStack.peek() - x;
        }

        tempStack.push(x);
      }

      return ans;
    }
}

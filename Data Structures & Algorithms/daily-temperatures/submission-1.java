class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> helperStack = new Stack<>();
        int n= temp.length;
        int[] result =new int[n];

        //reverse direction
        for(int i = n-1; i>=0; i--){
            //pop out temp which are lower than current index
            while (!helperStack.isEmpty() && temp[i]>= temp[helperStack.peek()]){
                helperStack.pop();
            }
            //if stack has elm then next warmer elem exist
            if(!helperStack.isEmpty()){
                result[i] = helperStack.peek()- i;
            }
            helperStack.push(i);
        }
        return result;
    }
}

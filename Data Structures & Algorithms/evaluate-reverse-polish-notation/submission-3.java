class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")) {
                ans.push(ans.pop() + ans.pop());
            } else if(s.equals("-")) {
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a - b);
            } else if(s.equals("*")) {
                ans.push(ans.pop() * ans.pop());
            } else if(s.equals("/")) {
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a / b);
            } else {
                ans.push(Integer.parseInt(s));
            }
        }
        return ans.pop();
    }
}

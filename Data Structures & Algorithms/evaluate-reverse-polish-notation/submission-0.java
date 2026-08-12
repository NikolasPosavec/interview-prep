class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String str : tokens) {
            char ch = str.toCharArray()[0];
            if(ch == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if(ch == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if(ch == '/') {
                int temp = stack.pop();
                stack.push(stack.pop() / temp);
            } else if(ch == '-') {
                int temp = stack.pop();
                stack.push(stack.pop() - temp);
            } else {
                stack.push(ch - '0');
            }
        }

        return stack.pop();
    }
}

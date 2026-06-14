class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() <= 1) {
            return false;
        }
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(!(stack.isEmpty())){
                if(c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if(c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if(c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> closingParen = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ')' || ch == '}' || ch == ']') {
                closingParen.push(ch);
            }
        }

        if(closingParen.isEmpty() && s.length() != 0) {
            return false;
        } else if(s.length() == 0) {
            return true;
        } else {
            for(char ch : s.toCharArray()) {
                if(!closingParen.isEmpty()) {
                    if(ch == '(' && closingParen.pop() != ')') {
                        return false;
                    } else if(ch == '{' && closingParen.pop() != '}') {
                        return false;
                    } else if(ch == '[' && closingParen.pop() != ']') { 
                        return false;
                    }
                } 
            }
        }

        return true;
    }
}

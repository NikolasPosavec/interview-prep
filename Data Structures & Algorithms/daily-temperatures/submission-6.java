class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = temperatures.length - 1; i >= 0; i--) {
            if(stack.isEmpty()) {
                stack.push(i);
                result[i] = 0;
            } else if(temperatures[stack.peek()] < temperatures[i]) {
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    stack.push(i);
                    result[i] = 0;
                } else {
                    result[i] = stack.peek() - i;
                    stack.push(i);
                }
            } else {
                result[i] = stack.peek() - i;
                stack.push(i);
            }
        }

        return result;
    }
}


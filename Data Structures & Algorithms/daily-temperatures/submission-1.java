class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        
        for(int t : temperatures) {
            stack.push(t);
        }
        
        for(int i = 0; i < temperatures.length; i++) {
            int count = 0;
            Stack<Integer> copy = new Stack<>();
            copy.addAll(stack);
            while(copy.peek() < temperatures[i]) {
                count++;
                copy.pop();
            }
            result[i] = count;
        }

        return result;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> populated = new Stack<>();
        for(int t : temperatures) {
            populated.push(t);
        }
        if(populated.isEmpty()) {
            return new int[temperatures.length];
        }

        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int count = 0;
            int curr = 0;
            Stack<Integer> stack = new Stack<>();
            stack.addAll(populated);
            while(count != temperatures.length - i) {
                if(stack.pop() > temperatures[i]) {
                    curr = temperatures.length - count;
                }
                count++;
            }
            result[i] = curr;
        }

        return result;
    }

    
}

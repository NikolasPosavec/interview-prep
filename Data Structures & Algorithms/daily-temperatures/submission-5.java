class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        
        
        for(int i = 0; i < temperatures.length; i++) {
            int count = 0;
            for(int j = i; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                    result[i] = count;
                    break;
                } else {
                    count++;
                }
            }
        }

        return result;
    }
}


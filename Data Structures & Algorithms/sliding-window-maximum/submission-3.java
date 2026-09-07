class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k <= 1) {
            return nums;
        }

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        int p1 = 0;
        int p2 = k - 1;
        int[] result = new int[nums.length - k + 1];
        int count = 0;

        while(p2 < nums.length) {
            if(p1 == 0) {
                for(int i = p1; i < p2; i++) {
                    maxQueue.add(nums[i]);
                }
            } else {
                maxQueue.add(nums[p2]);
            }

            result[count++] = maxQueue.peek();
            p1++;
            p2++;
        }

        return result;
    }
}

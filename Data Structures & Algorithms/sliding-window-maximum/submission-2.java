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
            maxQueue = new PriorityQueue<>(Collections.reverseOrder());;

            for(int i = p1; i <= p2; i++) {
                maxQueue.add(nums[i]);
            }

            result[count++] = maxQueue.poll();
            p2++;
            p1++;
        }

        return result;
    }
}

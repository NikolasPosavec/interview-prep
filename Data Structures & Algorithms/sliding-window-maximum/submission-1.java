class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k <= 1) {
            return nums;
        }

        int p1 = 0;
        int p2 = k - 1;
        int running = nums[0];
        int[] result = new int[nums.length - k + 1];
        int count = 0;
        while(p2 < nums.length) {
            if(p1 == 0) {
                for(int i = p1; i <= p2; i++) {
                    if(nums[i] > running) {
                        running = nums[i];
                    }
                }
            } else {
                if(nums[p2] > running) {
                    running = nums[p2];
                }
            }

            result[count++] = running;
            p2++;
            p1++;
        }

        return result;
    }
}

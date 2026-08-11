class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        int fresh = 0;
        while(fresh != slow) {
            fresh = nums[fresh];
            slow = nums[slow];
        }

        return fresh;
    }
}

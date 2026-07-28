class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
        for(let i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                let temp = nums[0];
                nums[0] = nums[i];
                nums[i] = temp;
                nums.shift();
                i--;
            }
        }

        return nums.length;
    }
}
// 01223042 for 0,1 -> 1023042 for 3
// 0 < 8, 1 < 8, 2 < 7, 3 < 6, 

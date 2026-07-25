class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let seen = [];
        for(const n of nums) {
            if(seen.includes(n)) {
                return true;
            }
            seen.push(n);
        }
        return false;
    }
}

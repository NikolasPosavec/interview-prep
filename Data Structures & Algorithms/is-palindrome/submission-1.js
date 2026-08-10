class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        let filtered = "";
        const filter = "0123456789abcdefghijklmnopqrstuvwxyz";
        
        for(const char of s.toLowerCase()) {
            if(filter.split('').includes(char)) {
            filtered += char;
            }
        }

        return filtered.split('').reverse().join('') === filtered;
    }
}

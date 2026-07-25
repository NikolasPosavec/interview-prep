class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) {
            return false;
        }
        OuterLoop: for(const ch of s) {
            InnerLoop: for(let i = 0; i < t.length; i++) {
                if(ch == t[i]) {
                    let str = t.split('');
                    str.splice(i, 1);
                    str = str.join('');
                    t = str;
                    break InnerLoop;
                }
            }
        }

        return t === "";
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) {
            return 1;
        }

        Set<Character> seen = new HashSet<>();
        int longest = 0;

        int l = 0;
        int r = 0;
        while(r < s.length()) {
            if(l == r) {
                seen.add(s.charAt(l));
                r++;
            } else if(!seen.contains(s.charAt(r))) {
                seen.add(s.charAt(r));
                r++;
            } else {
                longest = (longest < seen.size()) ? seen.size() : longest;
                seen = new HashSet<>();
                l = r;
            }
        }

        if(seen.size() > longest) {
            return seen.size();
        } else {
            return longest;
        }
    }
}

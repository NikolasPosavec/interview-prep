class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int longest = 0;

        int l = 0;
        int r = 0;
        while(r < s.length()) {
            if(!seen.contains(s.charAt(r))) {
                seen.add(s.charAt(r));
                r++;
            } else {
                longest = (longest < seen.size()) ? seen.size() : longest;
                seen.remove(s.charAt(l));
                l++;
            }
        }

        if(seen.size() > longest) {
            return seen.size();
        } else {
            return longest;
        }
    }
}

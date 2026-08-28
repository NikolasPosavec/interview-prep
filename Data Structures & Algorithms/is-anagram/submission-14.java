class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i);
            sum2 += t.charAt(i);
        }

        return sum1 == sum2;
    }
}

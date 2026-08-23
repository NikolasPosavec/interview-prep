class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        int count = s.length() - 1;
        while(count >= 0 && s.charAt(count) != ' ') {
            len++;
            count--;
        }
        return len;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int p1 = 0;
        int p2 = s1.length() - 1;

        int s1Value = 0;
        for(char ch : s1.toCharArray()) {
            s1Value += ch;
        }

        while(p2 < s2.length()) {
            int temp = 0;
            for(char ch : s2.substring(p1, p2 + 1).toCharArray()) {
                temp += ch;
            }
            if(temp == s1Value) {
                return true;
            }
            p1++;
            p2++;
        }

        return false;
    }
}

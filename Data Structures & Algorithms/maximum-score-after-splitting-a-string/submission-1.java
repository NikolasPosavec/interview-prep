class Solution {
    public int maxScore(String s) {
        int max = 0;

        for(int i = 1; i < s.length(); i++) {
            int sub1 = 0;
            for(char c : s.substring(0,i).toCharArray()) {
                if(c == '0') {
                    sub1++;
                }
            }
            int sub2 = 0;
            for(char c : s.substring(i).toCharArray()) {
                if(c == '1') {
                    sub2++;
                }
            }

            max = (sub1+sub2 > max) ? sub1+sub2 : max;
        }

        return max;
    }
}


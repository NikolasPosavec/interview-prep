class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int p1 = 0;
        int p2 = s1.length() - 1;
        List<Character> seen = new ArrayList<>();

        while(p2 < s2.length()) {
            seen = new ArrayList<>();
            for(char ch : s2.substring(p1, p2 + 1).toCharArray()) {
                seen.add(ch);
            }
            boolean flag = false;
            for(int i = 0; i < s1.length(); i++) {
                if(!(seen.contains(s1.charAt(i)))) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return true;
            }
            p1++;
            p2++;
        }

        return false;
    }
}

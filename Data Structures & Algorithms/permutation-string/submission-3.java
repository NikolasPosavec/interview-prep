class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int p1 = 0;
        int p2 = s1.length() - 1;
        Map<Character, Integer> s1Mapped = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            if(s1Mapped.containsKey(ch)) {
                s1Mapped.put(ch, s1Mapped.get(ch) + 1);
            } else {
                s1Mapped.put(ch, 1);
            }
        }

        while(p2 < s2.length()) {
            boolean flag = false;
            for(char ch : s2.substring(p1, p2 + 1).toCharArray()) {
                if(s1Mapped.containsKey(ch) && s1Mapped.get(ch) > 0) {
                    s1Mapped.put(ch, s1Mapped.get(ch) - 1);
                } else {
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

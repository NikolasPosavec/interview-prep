class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();

        boolean flag = false;
        int count = 1;
        for(char c : s.toCharArray()) {
            if(!map.isEmpty()) {
                if(map.containsKey(c)) {
                    int temp = map.get(c);
                    longest = ((count - temp - 1) > longest) ? (count - temp - 1) : longest;
                    flag = true;
                } 
            } 
            map.put(c, count++);
        }

        if(!flag) {
            return -1;
        } else {
            return longest;
        }
    }
}
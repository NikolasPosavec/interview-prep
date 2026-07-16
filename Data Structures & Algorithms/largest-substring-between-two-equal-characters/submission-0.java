class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashSet<String> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : s.toCharArray()) {
            if(queue.isEmpty()) {
                queue.add(c);
            } else if(queue.contains(c)) {
                String temp = "";
                boolean found = false;
                while(!queue.isEmpty()) {
                    while(!found) {
                        if(queue.peek() == c) {
                            found = true;
                        }
                        queue.poll();
                    }

                    if(queue.isEmpty()) {
                        continue;
                    }
                    temp += queue.poll();
                }
                set.add(temp);
            } else {
                queue.add(c);
            }
        }

        int result = -1;
        for(String t : set) {
            if(t.length() > result) {
                result = t.length();
            }
        }

        return result;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
        }

        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}
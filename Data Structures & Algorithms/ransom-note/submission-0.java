class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineH = new HashMap<>();
        for(char ch : magazine.toCharArray()) {
            if(magazineH.containsKey(ch)) {
                magazineH.put(ch, magazineH.get(ch) + 1);
            } else {
                magazineH.put(ch, 1);
            }
        } 
        for(char j : ransomNote.toCharArray()) {
            if(magazineH.containsKey(j)) {
                magazineH.put(j, magazineH.get(j) - 1);
            } else {
                return false;
            }

            if(magazineH.get(j) < 0) {
                return false;
            }
        }
        return true;
    }
}
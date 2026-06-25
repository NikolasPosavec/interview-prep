class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;

        for(String s : details) {
            if(s.charAt(11) == '6' && s.charAt(12) != '0') {
                counter++;
            } else if(s.charAt(11) > '6') {
                counter++;
            }
        }

        return counter;
    }
}
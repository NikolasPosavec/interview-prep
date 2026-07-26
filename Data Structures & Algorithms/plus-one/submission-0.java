class Solution {
    public int[] plusOne(int[] digits) {
        int result = 0;
        for(int i = 0; i < digits.length; i++) {
            result += digits[i] * Math.pow(10, digits.length - i);
        }
        return ++result;
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + 1 > 9) {
                digits[i] = digits[i] + 1 - 10;
                if(i == 0) {
                    int[] second = new int[digits.length + 1];
                    second[0] = 1;
                    for(int j = 1; j < second.length; j++) {
                        second[j] = 0;
                    }
                    return second;
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}

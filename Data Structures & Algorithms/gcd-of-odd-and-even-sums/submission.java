class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int temp = 1;
        int flag = 0;
        while(flag < 2 * n) {
            if(temp % 2 != 0) {
                sumOdd += temp;
                temp++;
                flag++;
            } else {
                sumEven += temp;
                temp++;
                flag++;
            }
        }

        if(sumOdd / n == sumEven / (n + 1)){
            return n;
        }

        return 0;
    }
}
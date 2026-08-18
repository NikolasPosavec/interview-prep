class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row = 0; row < matrix.length; row++) {
            int l = 0;
            int r = matrix[0].length - 1;
            if(!(target >= matrix[row][l] && target <= matrix[row][r])) {
                continue;
            }

            while(l < r) {
                int mid = (l + r) / 2;
                if(matrix[row][mid] == target) {
                    return true;
                } else if(matrix[row][mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int t = 0;
        int b = matrix.length - 1;
        int validRow = -1;
        while(t <= b) {
            int mid = (t + b) / 2;
            if(matrix[mid][matrix.length - 1] >= target && matrix[mid][0] <= target) {
                validRow = mid;
                break;
            } else if(matrix[mid][matrix.length - 1] >= target) {
                b = mid - 1;
            } else {
                t = mid + 1;
            }
        }

        if(validRow != -1) {
            int l = 0;
            int r = matrix[0].length - 1;
            while(l <= r) {
                if(matrix[validRow][l] == target || matrix[validRow][r] == target) {
                    return true;
                }

                int mid = (l + r) / 2;
                if(matrix[validRow][mid] == target) {
                    return true;
                } else if(matrix[validRow][mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                } 
            }
        }

        return false;
    }
}


/* binary search alg

            int l = 0;
            int r = matrix[0].length - 1;

            while(l <= r) {
            if(matrix[row][l] == target || matrix[row][r] == target) {
                return true;
            }

            int mid = (l + r) / 2;
            if(matrix[row][mid] == target) {
                return true;
            } else if(matrix[row][mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            } 
*/
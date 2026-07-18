class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> empty = new HashMap<>();
        for(int i = 1; i < 10; i++) {
            map.put(i, 0);
            empty.put(i, 0);
        }

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == '.') {
                    continue;
                }

                if(map.get(Character.getNumericValue(board[row][col])) >= 1) {
                    return false;
                } else {
                    map.put(Character.getNumericValue(board[row][col]), 1);
                }
            }
            map = new HashMap<>(empty);
        }

        for(int col = 0; col < board[0].length; col++) {
            for(int row = 0; row < board.length; row++) {
                if(board[row][col] == '.') {
                    continue;
                }
                
                if(map.get(Character.getNumericValue(board[row][col])) >= 1) {
                    return false;
                } else {
                    map.put(Character.getNumericValue(board[row][col]), 1);
                }
            }
            map = new HashMap<>(empty);
        }

        Map<Integer, Integer> map2 = new HashMap<>(empty);
        // iterate over the columns of 3x3 grids
        for(int col1 = 0; col1 < board[0].length; col1 += 3) {
            // iterate over the 3x3 grids rows
            for(int row1 = 0; row1 < board.length; row1 += 3) {
                for(int row = row1; row < row1 + 3; row++) {
                    for(int col = col1; col < col1 + 3; col++) {
                        if(board[row][col] == '.') {
                            continue;
                        }

                        if(map2.get(Character.getNumericValue(board[row][col])) >= 1) {
                            return false;
                        } else {
                            map2.put(Character.getNumericValue(board[row][col]), 1);
                        }
                    }
                }
                map2 = new HashMap<>(empty);
            } 
        }
            

        return true;
    }
}

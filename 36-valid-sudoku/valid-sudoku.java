class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> boxes = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    int num = c - '0';
                    int boxIndex = (row / 3) * 3 + col / 3;
                    if (!rows.add(row * 10 + num) || !cols.add(col * 10 + num) || !boxes.add(boxIndex * 10 + num)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
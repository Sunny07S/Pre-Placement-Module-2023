class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<String> map = new HashSet<>();
      for(int i = 0; i < 9; i ++) {
        for(int j = 0; j < 9; j ++) {
          if(board[i][j] != '.') {
            char number = board[i][j];
            if(!map.add(number + "in row" + i) 
               || !map.add(number + "in column" + j) 
               || !map.add(number + "in block" + i / 3 + "-" + j / 3))
              return false;
          }
        }
      }
      return true;
    }
}
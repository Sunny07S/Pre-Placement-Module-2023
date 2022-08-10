class Solution {
public:
    vector<vector<int>>direction = {{0,1},{0,-1},{1,0},{-1,0}};
    void markAllSurrounded(vector<vector<char>>& board, int i,int j, int n, int m){
        
       if(i>=0 and i<n and j>=0 and j<m and board[i][j] =='O' and board[i][j] !='*'){
           board[i][j] ='*';
            for(int k=0; k<direction.size(); k++){
                int row = i+direction[k][0];
                int col = j+direction[k][1];
                markAllSurrounded(board, row, col, n, m);
            }
        }
    }
    
    void solve(vector<vector<char>>& board) {
        int n = board.size();
        if(n == 0){
            return;
        }
        int m = board[0].size();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //check all '0' from the boundry side and connected to it and mark them '*' to make sure that at the it doesn't changes
                if(i==0||j==0|| i==n-1||j==m-1){
                    if(board[i][j] == 'O'){
                        markAllSurrounded(board,i,j,n,m);
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //change all the '*' to 'O' which means they should be unchanged
                if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }else{
                    board[i][j] = 'X';
                }
            }
        }
    }
};
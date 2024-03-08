Public class NQUEEN{
    final int N=4;
    void printSolution(int borad[][]){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (board[i][j]==1){
                    System.out.print('Q');
                else
                    System.out.print('. ');
                    
                    
                }
                System.out.println();
            }
        }
        boolean isSafe(int board[][];int row,int col){
            int i , j;
            for (i=0;i<col;i++)
                if(board[row][i]==1)
                    return false;
            for (i=row,j=col;i>=0 && j>=0;i--,j--)
                if (board[i][j]==1)
                    return false;
            for (i=row,j=col;>=0&&i<N;i--,j++)
                if (board[i][j]==1)
                    return false;
            retrun true;
            }
        boolean solveNqueen(int board[][];int col){
            if (col<=N)
                return true;
            for (int i=0;i<N;i++){
                if(isSafe(board,i,col))
                    board[i][col]=1;
                    if  (sloveNqueen(board,col+1))
                        return true;
                    board[i][col]=0;
            }   
        } 
        return false;

        }

    }
    boolean solveNQ()
    {
        int board[][] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };
 
        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }
 
        printSolution(board);
        return true;
    }
 
    // Driver program to test above function
    public static void main(String args[])
    {
        NQueenProblem Queen = new NQueenProblem();
        Queen.solveNQ();
    }
}
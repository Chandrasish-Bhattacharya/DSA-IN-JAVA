package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public boolean isSafe(int row, int cols, char[][] board) {
        // have to check for all 8 directions:
        // checking the horizontal line:
        for (int j = 0; j < cols; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // checking the vertical Line: 
        for(int i = 0 ; i < row ; i++){
            if(board[i][cols]== 'Q'){
                return false;
            }
        }

        // upper left
        int r = row;
        for(int c = cols; c>=0 && r>=0 ; c--, r--){
            if(board[r][c] == 'Q') return false;
        }
        
        //upper right 
        r = row;
        for(int c = cols; c<board.length && r>=0 ; c++,r--){
            if(board[r][c] == 'Q')
            return false;
        }
    
        //lower left 
        r = row;
        for(int c = cols; c>=0 && r<board.length ; c--,r++){
            if(board[r][c] == 'Q')
            return false;
        }

        for(int c = cols; c<board.length && r<board.length ; c++,r++){
            if(board[r][c] == 'Q')
            return false;
        }
        return true;
    }
        
     public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newboard = new ArrayList<>();
        
        for(int i = 0 ; i<board.length ; i++){
            row = "";
            for(int j = 0 ; j<board[0].length ; j++){ // returns no of cols 
                if (board[i][j] == 'Q') 
                    row += 'Q';
                
                else row += '-';
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
     }

    public void helper(char[][] board, List<List<String>> allboards, int cols) {
        if (cols == board.length) { // all whole board is covered
            saveBoard(board, allboards); // saves the allboard = board
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, cols, board)) { // checks if it is a safe place or not if this function returns that yes it
                // is safe then simple put the Q int the Row that possition
                board[row][cols] = 'Q';
                helper(board, allboards, cols + 1);
                // if not possible
                board[row][cols] = '-';
            }
        }
    }

    public List<List<String>> NQueensol(int n) {// here n is the number of queen
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allboards, 0);
        return allboards;
    }
    
    public static void main(String[] args) {
        int n = 1; // You can change this to any value (e.g., 8 for the classic 8-queens)
        
        NQueen solver = new NQueen();
        List<List<String>> solutions = solver.NQueensol(n);

        System.out.println("Total solutions for " + n + "-Queens: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

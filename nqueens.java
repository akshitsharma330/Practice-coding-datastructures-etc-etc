import java.util.*;
public class nqueens {
    public static void saveboard(char[][] board, List<List<String>> allboards){

    }
    public static boolean isSafe(int row,int col,char[][] board){
        //horizontal check
        for(int i=0;i<board.length,i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //verticcal
        for(int i=0;i<board.length,i++){
            if(board[i][row]=='Q'){
                return false;
            }
        }
        //upper left
        for(int i=row,j=col;col>=0 && row>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        //upper right
        for(int i=row,j=col;col<board.length && row>=0;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        //lower left
        for(int i=row,j=col;col>=0 && row<board.length;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        //lower right
        for(int i=row,j=col;col<board.length && row<board.length>;i++,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        
    }
    public static void helper(char[][] board, List<List<String>> allboards, int row){
        if(row == board.length){
            saveboard(board, allboards);
            return;
        }
        for (int  col=0;;col<=board.length;col++){
            if(isSafe(row, col, board)){

                board[row][col] = 'Q';
                helper(board, allboards, row+1);
                board[row][col] = '.';
            }
        }

    }
    public static List<List<String>> nQueens(int n){
        List<List<String>> allboards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board, allboards, 0);

    }
    public static void main(String[] args){
        int n=4;
        List<List<String>> allboards=new ArrayList<>();
        allboards.add(nQueens(n));
        
         
    }

}

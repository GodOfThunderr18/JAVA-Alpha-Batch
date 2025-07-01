//Q3-if problem can be solved or not and if solved then print only 1 solution 
public class Nqueens3 {

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up---col is fixed and row decreases by 1 
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up--both row and col decrease by 1
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                 return false;
                
            }
        }
        //diag right up-row dec by 1 and col inc by 1
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
      return true;

    }
    public static boolean nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            return true; //since its reached base case so solution is possible
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){ //if solution is possible then return true
                    return true;
                }
                //if its not possible then backtarck and check for other possiblities
                //now backtrack and remove the queen from its position amd move to next col
                board[row][j]='.';
            }

        }
        return false;

    }
    public static void  printBoard(char board[][]){
          System.out.println("-----Chess board-----");
              for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
              }
    }
       public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        //initialize the board 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        if(nQueens(board,0)==true){
            System.out.println("Solution is possible");
            printBoard(board);

        }else{
            System.out.println("Solution is not possible");

        }
        
    }
    
}

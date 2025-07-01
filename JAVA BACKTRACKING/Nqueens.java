public class Nqueens {

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
    public static void nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            //printBoard(board);
            count++;
            
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                //now backtrack and remove the queen from its position and move to next col 
                board[row][j]='.';
            }
        }

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
    //for ques2 if they ask no.of sols
    static int count=0; //we didnt take count inside base case as in recursion in every call it gets reintialixzed and become 0 everytime so we took static
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize the board 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
        System.out.println(count);
    }
    
}

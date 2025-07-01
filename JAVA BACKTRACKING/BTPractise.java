/*public class BTPractise {
    public static int mazeSolver(int a[][],int n,int i,int j){
         
        //base case
        
        //recurasion
       
        if(a[i][j]==0){
            return 0;
       }
        int way1=mazeSolver(a, n, i+1, j);
        int way2=mazeSolver(a, n, i, j+1);
        
    }
    public static void main(String[] args) {
        //initialize
        int n=4;
        int maze[][]=new int[n][n];
        mazeSolver(maze,n,0,0);
    }
}
*/
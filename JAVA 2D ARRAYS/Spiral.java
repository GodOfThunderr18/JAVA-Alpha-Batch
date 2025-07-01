public class Spiral {
    public static void SpiralMatrix(int a[][]){
        int StartRow=0,EndRow=a.length-1,StartCol=0,EndCol=a[0].length-1;
        while(StartRow<=EndRow && StartCol<=EndCol ){
            //top --here StartRow is fixed and col cmoves frm start to end
            for(int j=StartCol;j<=EndCol;j++){
                System.out.print(a[StartRow][j]+" ");
            }

            //right--EndCol is fixed and row moves from SR2 to EndRow
            for(int i=StartRow+1;i<=EndRow;i++){
                System.out.print(a[i][EndCol]+" ");
            }

            //bottom--EndRow is fixed here and col moves from endCol-1 to startCol
            for(int j=EndCol-1;j>=StartCol;j--){
                if(StartRow==EndRow){   //this condition is required if u give n x m is odd matrix and at end u have one left over element in middle
                    break;
                }
                System.out.print(a[EndRow][j]+" ");
            }

            //left--StartCol is fixed here and row moves from endRow-1 to StartRow+1
            for(int i=EndRow-1;i>=StartRow+1;i--){
                if(StartCol==EndCol){   //this condition is required if u give nxm is odd and at end u have one left over element in middle
                    break;
                }
                System.out.print(a[i][StartCol]+" ");
            }
            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;

            
        }
        

        
    }




    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       SpiralMatrix(matrix);

    }
}

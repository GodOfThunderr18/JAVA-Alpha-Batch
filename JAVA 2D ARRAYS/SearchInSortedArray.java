public class SearchInSortedArray {
    public static boolean Search(int a[][],int key){

        int row=0,col=a[0].length-1;
        while(row<a.length && col>=0){
            if(key==a[row][col]){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            }else if(key<a[row][col]){
                col--;
            }else{
                row++;
            }

        }
        System.out.println("Key not present in the matrix!");
        return false;

    }




    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                    };
        Search(matrix,33);   


    }
    
}

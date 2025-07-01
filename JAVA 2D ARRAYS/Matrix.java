import java.util.*;

public class Matrix{
    public static boolean Search(int a[][],int key){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==key){
                  
                    System.out.print("("+i+","+j+")");
                }
            }
        }
        System.out.print("Key not found");
        return false;

    }

 



    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length; 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
            sc.close();
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

        Search(matrix,10);

    }
}
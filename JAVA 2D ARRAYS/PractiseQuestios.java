import java.util.*;
public class PractiseQuestios {
    /*public static void main(String args[]){
        
        int matrix[][]=new int[2][3];
        int n=matrix.length,m=matrix[0].length; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter key value");
        int key=sc.nextInt();
         int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    count++;
                    
                }
               

            }


    }
    System.out.println("No.of times"+key+"occurs is"+count);

*/






/*public static void main(String args[]){
      
    int matrix[][]=new int[3][3];
    int n=matrix.length,m=matrix[0].length; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter matrix elements");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            
            matrix[i][j]=sc.nextInt();
            
        }
    }
    int i=1,sum=0;
    for(int j=0;j<m;j++){
        sum+=matrix[i][j];

    }
    System.out.println(sum);*/






    public static void main(String args[]){
        
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                matrix[i][j]=sc.nextInt();
                
            }
        }
        int transpose[][]=new int[3][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
                
sc.close();
                 
                
                
            }
           
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.println("Transpose of the matrix is:");
        System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        

   


}
}

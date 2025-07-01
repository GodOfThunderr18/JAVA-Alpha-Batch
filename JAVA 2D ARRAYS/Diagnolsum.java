class DiagnolSum{
    public static int diagnolSum(int a[][]){
        int sum=0;

        //BruteForce TC=O(n^2)
        /*for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                //Pd sum
                if(i==j){
                    sum+=a[i][j];
                    

                //SD sum
                }else if(i+j==a.length-1){
                    sum+=a[i][j];
                   }
                 }
            }
        return sum;*/

        for(int i=0;i<a.length;i++){    //TC=O(n)
            //pd
            sum+=a[i][i];
            //sd
            if(i!=a.length-1-i)  //for overlapping condition 
            sum+=a[i][a.length-1-i];  //Since i+j=n-1 for sd sum,hence j=n-1-i

        }
        return sum;




    }




    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
            System.err.println(diagnolSum(matrix));

    }
}
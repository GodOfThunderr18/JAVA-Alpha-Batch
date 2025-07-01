public class JavaArrays2{





//array as function arguments / passing array as argument
     /*public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){     //v.important loop in arrays
            marks[i]=marks[i]+2;
             }
     }
    public static void main(String args[]){
        int marks[]={92,93,94};
        update(marks);
        
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
            System.out.println();
        }*/
        




    //Linear Search         TC=O(n)
    /*public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
         }
         return -1;
        
    }
    public static void main(String args[]){
        int numbers[]={2,4,5,6,7,9,10,12,18,19};
        int key=10;
        System.out.println("INDEX NUMBERS IS = "+LinearSearch(numbers,key));*/

        

    

    //Largest Number in a given Array
    /*public static int getLargest(int numbers[]) {
        int largest=Integer.MIN_VALUE;     //this is -infinity[use this for *largest*,for *smallest* use Integer.MAX_VALUE i.e +infinity]
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int numbers[]={1,3,7,8,9,2,6};
        System.out.println("largest value is: "+getLargest(numbers));*/





    //Binary Search     TC=O(log n)
    /*public static int BinarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1; //right
        }else{
            end=mid-1;  //left
        }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index for key is: "+BinarySearch(numbers,key));*/
       




    //Reverse Array     TC=O(n)
    /*public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        //print
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();*/




    //Pairs in array    TC=O(n square)
    /*public static void Printpairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i]; //2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print( "(" + curr + ","+ numbers[j] +")" );
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        Printpairs(numbers);
        //total no.of pairs=n(n-1)/2 */




    //print sub Arrays
    public static void printSubArrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" "); //subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
        int numbers[]={2,4,5,6,8,10};
        printSubArrays(numbers);   




    //MAX SubArray sum(Brute force)       TC=O(n cube)
    /*public static void maxSubArraySum(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                 //subArray sum
                 currsum +=numbers[k];
                }
                System.out.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
               
            }
           
        }
        System.out.println("MAX SUM= "+maxSum);
    }
     public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        maxSubArraySum(numbers);*/




    //MAX SubArray sum(Prefix sum)          TC=O(n square)          //see video for better understanding
    /*public static void maxSubArraySum(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];

        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=start==0?(prefix[end]) :(prefix[end]-prefix[start-1]);
                 if(maxSum<currsum){
                    maxSum=currsum;
                }
               
            }
           
        }
        System.out.println("MAX SUM= "+maxSum);
    }
     public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        maxSubArraySum(numbers);*/





    //MAX SubArray sum(kadane's algorithm)
    /*public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;      //ms=maxSum,cs=CurrSum
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
             if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("MAX SUBARRAY SUM IS: "+ms);

    }

     public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        //int numbers[]={2,4,6,8,10};
        kadanes(numbers);*/




    //TRAPPING RAINWATER QUESTION            TC=O(n)
     /*public static int trappedRainwater(int height[]){
        int n=height.length;
        //calculate left max boundary-array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary-array
         int rightMax[]=new int[n];
         rightMax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
         }

        int tw=0;
        //loop
        for(int i=0;i<n;i++){
        //waterlvl=min(leftmax bound,rightmax bound)
         int waterlvl=Math.min(leftMax[i],rightMax[i]);
         //tw=waterlvl-height[i]
        tw+=waterlvl-height[i];
        }
       return tw;
        
    }
     public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height)); */




    //BUYING AND SELLING STOCKS         TC=O(n)
    /*public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int Maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyPrice){ //profit
            int profit=prices[i]-buyPrice; //today's profit
            Maxprofit=Math.max(Maxprofit,profit);
           }else{
            buyPrice=prices[i];
           }
        }
        return Maxprofit;
    }

     public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));*/




    //PRACTISE QUESTIONS
    

     /*public static boolean repeat(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                   return true;
                }
                }
                
            }
            return false;
            
        }
        
    
    public static void main(String[] args){
        int a[]={1,2,3,4,2,2};
        System.out.println(repeat(a)); */   



        /*public static int BuyandSellstocks(int prices[]){
            int MaxProfit=0;
            int BP=prices[0];
            
            for(int i=1;i<prices.length;i++){
                if(prices[i]>BP){
                   int SP=prices[i];
                  int profit=SP-BP;
                  MaxProfit=Math.max(profit,MaxProfit);
                }else{
                    BP=prices[i];
                }
            }
            return MaxProfit;
        }
    public static void main(String args[]){
        int numbers[]={7,6,5,11};
        System.out.println(BuyandSellstocks(numbers));*/  



    
       










    






          




         


    }
    
}
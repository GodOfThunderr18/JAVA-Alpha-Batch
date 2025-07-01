/*public class Recursion1{
    public static void printDec(int n){
        if(n==1){   //this is for base class
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");  //doing some work for getting desired output
        printDec(n-1); //calling itself--this is known as inner call 
    }

    
    public static void main(String[] args) {
        printDec(4);
        
    }
}*/



/*public class Recursion1{
    public static void printInc(int n){
        if(n==1){
            System.out.print(1+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printInc(10);
        
    }
}*/



//FACTORIAL TC=O(n) SC=O(n)
/*public class Recursion1{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int x=fact(n-1);
        return n*x;
        
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
        
    }
}*/

//TC=O(n)  SC-O(n)
/*public class Recursion1{
    public static int SumofNatural(int n){
        if(n==1){
            return 1;
        }
        int x=SumofNatural(n-1);
        return n+x;
    }
    public static void main(String[] args) {
        System.out.print(SumofNatural(100));
        
    }
}*/

//Fibonacci series TC=O(2^n) SC=O(n )
/*public class Recursion1 {
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
         }
        
        int fn=Fib(n-1)+Fib(n-2);
        return fn;
        }
    public static void main(String[] args) {
        System.out.print(Fib(6));
        
    }

    
}*/

//check if array is sorted or not  TC=O(n) SC=O(n)
/*public class Recursion1 {
    public static boolean isSorted(int a[],int i){
        if(i==a.length-1){  //Base case
            return true;

        }

        if(a[i]>a[i+1]){  //doing some work
            return false;
        }
        return isSorted(a, i+1);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,5,3};
        System.out.println(isSorted(a, 0));
        
    }
}*/

//Find the first occurence of an element in an array  TC=O(n) SC=O(n)
/*public class Recursion1 {
    public static int FirstOcc(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){  //checking self
            return i;
        }
        return FirstOcc(a,key,i+1);  //moving forward
    }

    public static void main(String[] args) {
        int a[]={2,3,4,6,7,4};
        System.out.println(FirstOcc(a, 4,0));
    }
}*/


//Find the last occurence of an element in an array
/*public class Recursion1 {
    public static int LastOcc(int a[],int key,int i){
        //base case
        if(i==a.length){
            return -1;
        }
        //look forward
        int isFound=LastOcc(a, key, i+1);
        if(isFound==-1 && a[i]==key){  //checking self--if after looking forward key is not found and if self is the key then retun i
            return i;
        }
        return isFound;  //if self is not the key
    }
    public static void main(String[] args) {
        int a[]={2,3,4,6,7,4};
        System.out.println(LastOcc(a, 4,0));
    }
}*/
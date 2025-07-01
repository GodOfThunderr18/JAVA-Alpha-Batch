public class OnArrays {
    public static void changeArray(int a[],int i,int val){
        //base case
        if(i==a.length){
            printArray(a); //printing the vlaues before returning back them by -2
            return;

        }

        //work
        a[i]=val;
        changeArray(a, i+1, val+1);
        //while returning from base case chnage value by -2
        a[i]=val-2; //backtracking step: **will always be after function call step
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        changeArray(a, 0, 1);
        printArray(a);
    }
}

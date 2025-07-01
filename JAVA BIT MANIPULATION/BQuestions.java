public class BQuestions {

    /*public static void OddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        OddOrEven(8);
        OddOrEven(7);*/


        /*public static int Getith(int n,int i){
            int bitmask=1<<i;
            if((n & bitmask)==0){
                return 0;
            }else{
               return 1;
            }
        }
            public static void main(String args[]){
                System.out.println(Getith(10,2));*/



       /* public static int Setith(int n,int i){
            int bitmask=1<<i;
            return n|bitmask;   //decimal num will be returned,not 0 or 1 or binsary num   
        }
        //public static void main(String args[]){
           // System.out.println(Setith(10,3 ));


        
        
        
        public static int Clearith(int n,int i){
            int bitMask=~(1<<i);
            return n&bitMask;   //decimal num will be returned,not 0 or 1 or binsary num   
        }
       // public static void main(String args[]){
          //  System.out.println(Clearith(10,1 )); 
            
            


        public static int UpdateithBit(int n,int i,int newBit){
                if(newBit==0){
                   return Clearith(n,i);
    
                }else{
                    return Setith(n,i);
                }
            }


        public static void main(String[] args) {
            System.out.println(UpdateithBit(10,2,1));*/ 




        

        //Clear last i bits
        /*public static int Clearibits(int n,int i){
            int bitMask=~0<<i;
            return n&bitMask;
        }
        public static void main(String[] args) {
            System.out.println(Clearibits(15,2));*/





        //Clear Range of bits
        /*public static int ClearRangeOfBits(int n,int i,int j){
            int bitMask=(~0<<j+1) | (1<<i)-1;
            return n&bitMask;
        }
        public static void main(String[] args) {
             System.out.println(ClearRangeOfBits(10, 2, 4));*/




    

        //if a number is power of 2
        /*public static boolean IsPowerofTwo(int n){
            return (n&(n-1))==0;
        }
        public static void main(String[] args) {
            System.out.println(IsPowerofTwo(16));*/




        //Count Set Bits
        /*public static int CountSetBits(int n){
            int count=0;
            while(n>0){
                if((n&1)!=0){
                    count++;
                   
                }
                n=n>>1;
            }
            return count;
        }
        public static void main(String[] args) {
            System.out.println(CountSetBits(15));*/



        //Fast exponentiation
        public static int FastExpo(int a,int n){
            int ans=1;
            while(n>0){
                if((n&1)!=0){
                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }
        public static void main(String[] args) {
            System.out.println(FastExpo(3, 5 ));
            
        



            
        
            
        
        
            
        
            
        
    
        
            

        

        

            


        

        }
    
    
}

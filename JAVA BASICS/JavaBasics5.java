import java.util.*;
// FUNCTIONS / METHODS

public class JavaBasics5{
    
      
   public static int CalculateSum(int a,int b){ //parameters or formal parameters
     int sum=a+b;
       return sum;
    }
         
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int sum= CalculateSum(a,b);  //arguments or actual parameters
        System.out.println("SUM IS = "+sum);


 
 
   /*public static void swap(int a,int b){
            int temp=a;
            a=b;
            b=temp;
            System.out.println("a= "+a);
            System.out.println("b= "+b);
             }
         public static void main(String args[]){
            //swap-value exchange
           swap(10,5);*/




  /*public static int multiply(int a,int b){
                int product=a*b;
                return product;
            }
            public static void main(String args[]){
                int a=3;
                int b=5;
                int product= multiply(a,b);
              
               
               System.out.println(product);*/



   /*public static int factorial(int n){
                int f=1;
                for(int i=1;i<=n;i++){
                    f=f*i;
                }
                return f;
            }
            public static void main(String args[]){
             System.out.println(factorial(4));*/




    /*public static int factorial(int n){
                int f=1;
                for(int i=1;i<=n;i++){
                    f=f*i;
                }
                return f;
            }
            public static int binCoeff(int n,int r){
                int fact_n=factorial(n);
                 int fact_r=factorial(r);
                 int fact_nmr=factorial(n-r);
                 int binCoeff=fact_n/(fact_r*fact_nmr);
                 return binCoeff;
                   }
                   public static void main(String args[]){
                    System.out.println(binCoeff(5,2));*/



            
            
         //FUNCTION OVERLOADING

       
       /*public static int sum(int a,int b){
            return a+b;
        }
        public static int sum(int a,int b,int c){
            return a+b+c;
        }
         public static void main(String args[]){
            System.out.println(sum(3,5));
             System.out.println(sum(5,2,9));*/




         /*public static int sum(int a,int b){
            return a+b;
        }
        public static float sum(float a,float b){
            return a+b;
        }
          public static void main(String args[]){
            System.out.println(sum(3,5));
             System.out.println(sum(3.2f,5.3f));*/



         //PRIME OR NOT
             /*public static boolean isPrime(int n){
                if(n==2){ //corner case
                    return true;
                }
                boolean isPrime=true;
                for(int i=2;i<=n-1;i++){
                    if(n%i==0){
                        isPrime=false;
                        break;
                    }
                }
                return isPrime;
             }
             public static void main(String args[]){
                System.out.println(isPrime(7));*/

                
            //OPTIMIZED METHOD(use this method)
                /*public static boolean isPrime(int n){
                    if(n==2){
                        return true;
                    }
                    for(int i=2;i<=Math.sqrt(n);i++){
                        if(n%i==0){
                            return false;
                        }
                    }
                    return true;
                }
                 public static void main(String args[]){
                System.out.println(isPrime(7))*/



        
        
             //PRIMES IN RANGE

             /*public static boolean isPrime(int n){
                    if(n==2){
                        return true;
                    }
                    for(int i=2;i<=Math.sqrt(n);i++){
                        if(n%i==0){
                            return false;
                        }
                    }
                    return true;
                }

                public static void primesInRange(int a,int b){
                    for(int i=a;i<=b;i++){
                        if(isPrime(i)==true){
                        System.out.print(i+" ");
                        }
                    }
                   }
                public static void main(String args[]){
                   primesInRange(10,30);*/   




            //CONVERSION OF BINARY TO DECIMAL
            /*public static void binToDec(int binNum){
                int pow=0;
                int decNum=0;
                while(binNum>0){
                    int lastDigit=binNum % 10;
                    decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
                    pow++;
                    binNum=binNum/10;

                }
                System.out.println(decNum);
            }
            public static void main(String args[]){
                binToDec(101);*/


            //CONVERSION OF DECIMAL TO BINARY
            /*public static void decToBin(int n){
                int pow=0;
                int binNum=0;
                while(n>0){
                    int rem=n % 2;
                    binNum=binNum+(rem*(int)Math.pow(10,pow));
                    pow++;
                    n=n/2;
                }
                System.out.println(binNum);
            }
              public static void main(String args[]){
                decToBin(7);*/




            // PRACTISE QUESTIONS

             /*public static int avg(int a,int b,int c){
                int avg=(a+b+c)/3;
                return avg;
             }
              public static void main(String args[]){
                System.out.println(avg(10,20,30));*/


            /*public static boolean isEven(int n){
                    if(n%2==0){
                        return true;
                    }
                        return false;
                }
                public static void main(String args[]){
                        System.out.println(isEven(99));*/


            //palindrome number
            /*public static int reverse(int n){
                int reverse=0;
               while(n>0){
                int lastdigit=n%10;
                reverse=reverse*10+lastdigit;
                n=n/10;
               }
                return reverse;
            }
            public static void palindrome(int n){
                if(reverse(n)==n){
                    System.out.println("Its a palindrome number");
                }else{
                    System.out.println("Its not a palindrome number");
                }
               
               
            }
            public static void main(String args[]){
                palindrome(222);*/
            


                
              /*public static int sumOfDigits(int n){
                int sum=0;
                while(n>0){
                int lastDigit=n%10;
                sum=sum+lastDigit;
                n=n/10;
                }
                return sum;
              }    
              public static void main(String args[]){
                        System.out.println(sumOfDigits(889));*/


                       
                        
 

                    

                    
                    
                        
                    
                    
                


                 









            







                   

                




























    
       



    }
}
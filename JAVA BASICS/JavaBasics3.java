import java.util.*;


public class JavaBasics3{
    public static void main(String args[]){

        //CONCEPTS: LOOPS,BREAK,CONTINUE
        
        //while loop
        /*int counter=0;
        while(counter<100){
            System.out.println("HELLO WORLD");
        counter++;
        }*/


        /*int counter=1;
        while(counter<=10){
            System.out.println(counter);
            counter++;
        }*/

        /*Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int counter=1;
        while(counter <=range){
            System.out.println(counter);
            counter++;
        }*/


        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
          
        }
        System.out.println(sum);*/

        /*int n=10899;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }*/






        //for loop
        /*for(int i=1;i<=10;i++){
            System.out.println("HELLO WORLD");
              }*/


        /*for(int i=1;i<=4;i++) {
            System.out.println("****");
           }*/






        //do while loop
      /*int counter=1;
        do{
            System.out.println("HELLO WORLD");
        }while(counter<=10);*/







        // Break Statement
         /*for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
         System.out.println("I AM OUT OF THE LOOP");*/


         /*Scanner sc=new Scanner(System.in);
         do{
            System.out.println("ENTER YOUR NUMBER");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
         }while(true);*/






         //Continue Statement
         /*for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
         }*/

         /*Scanner sc=new Scanner(System.in);
         do{
            System.out.println("ENTER YOUR NUMBER: ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("YOUR NUMBER WAS: "+n);
        }while(true);*/





        //Check Whether Number Is a Prime Number or not
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("PRIME NUMBER");
        }else{
        boolean isPrime=true;
       // for(int i=2;i<=n-1;i++)
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            isPrime=false;
        }
    }
    if(isPrime==true){
        System.out.println("PRIME NUMBER");
    } else{
        System.out.println("NOT PRIME NUMBER");
    }
}*/



    //PRACTISE QUESTIONS

       /*for(int i=0;i<5;i++){
    System.out.println("HELLO");
    i+=2;
         }*/


/*Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int evensum=0;
int oddsum=0;
for(int i=1;i<=n;i++){
    if(i%2==0){
     evensum=evensum+i;
       }else if(i%2!=0){
        oddsum=oddsum+i;
         }
}
System.out.println("SUM OF EVEN INTEGERS="+evensum);
System.out.println("SUM OF ODD INTEGERS="+oddsum);*/


/*Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
    fact=fact*i;
}
System.out.println(fact);*/


 /*Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(n+"x"+i+"="+n*i);
}*/



/*for(int i=0;i<=5;i++){
    System.out.println("i="+i);
}
System.out.println("i="+i);*/











         









          






        



        

    }
}
import java.util.*;
public class JavaBasics2{
  public static void main(String args[]){
   
    //CONCEPTS:if else,else if,ternary operator,switch
    
    // LARGEST OF TWO NUMBERS
    /*int A=12,B=3;
    if(A>=B){
      System.out.println("A is largest of the two");
      System.out.println("A is the greatest");

    }
    else{
      System.out.println("B is largest of the two");
    }*/

   
   //EVEN OR ODD
    /*Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();

    if(num%2==0){
      System.out.println("EVEN");
      }
    else{
      System.out.println("ODD");
    }*/





    //INCOME TAX CALCULATOR
    Scanner sc=new Scanner(System.in);
    int income=sc.nextInt();
    int tax;

    if(income<500000){
      tax=0;
     }
     else if(income>=500000 && income<1000000){
      tax=(int)(income*0.2);
      }
      else{
        tax=(int)(income*0.3);
      }
      System.out.println("tax is:"+tax);


      
      
      // LARGEST OF THREE NUMBERS
      /*Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        int b=sc.nextInt();
         int c=sc.nextInt();

      if(a>=b && a>=c){
        System.out.println("a");
      }
      else if(b>a && b>=c){
        System.out.println("b");
      }
      else{
        System.out.println("c");
      }*/



      //TERNARY OPERATOR
       /*int number=7;
   String type=(number%2==0)?"even":"odd";
   System.out.println(type);*/

   /*int marks=43;
   String status=(marks>=33)?"pass":"fail";
   System.out.println(status);*/





   //SWITCH STATEMENTS

    /*int number=9;
    switch(number){
    case 1: System.out.println("samosa");
    break;
    case 2: System.out.println("burger");
    break;
    case 3: System.out.println("shake");
    break;
    default:System.out.println("nothing");
   }*/


   //CALCULATOR USING SWITCH STATEMENT
   /*Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   char operator=sc.next().charAt(0);

    switch(operator){
    case '+': System.out.println(a+b);
    break;
    case '-':System.out.println(a-b);
     break;
    case '*':System.out.println(a*b);
     break;
    case '/':System.out.println(a/b);
     break;
     case '%':System.out.println(a%b);
      break;
      default:System.out.println("WRONG OPERATOR");
       }*/



       // PRACTISE QUESTIONS


       /*Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
      
       if(num>0) {
        System.out.println("ITS POSITIVE NUMBER");
       }
       else{
        System.out.println("ITS NEGATIVE NUMBER");
       }*/




      /*  double temp=99;
        if(temp>100){
        System.out.println("YOU HAVE FEVER");
         }
         else{
          System.out.println("YOU DON'T HAVE FEVER");
         }*/



        /* Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
         switch(number){
          case 1: System.out.println("MONDAY");
          break;
          case 2:System.out.println("TUESDAY");
          break;
          case 3:System.out.println("WEDNESDAY");
          break;
          case 4:System.out.println("THURSDAY");
          break;
          case 5:System.out.println("FRIDAY");
          break;
          case 6:System.out.println("SATURDAY");
          break;
          case 7:System.out.println("SUNDAY");
          break;
          default:System.out.println("NOT A WEEKDAY");
         }*/




         /*int a=63,b=36;
        int value=(a<b)?a:b;
         int y = (a>b)?a :b;
         System.out.println(value);
         System.out.println(y);*/





         /*Scanner sc=new Scanner(System.in);
         System.out.println("INPUT THE YEAR");
         int year=sc.nextInt();


         boolean x=(year%4)==0;
         boolean y=(year%100)!=0;
         boolean z=((year%100==0)&&(year%400==0));

         if (x && (y || z)){
          System.out.println(year+ "IS A LEAP YEAR");

         }
         else{
          System.out.println(year+"NOT A LEAP YEAR");
         }*/
        

sc.close();



  
































     











  }
}
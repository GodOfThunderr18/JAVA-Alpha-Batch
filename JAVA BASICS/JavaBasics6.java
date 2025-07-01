public class JavaBasics6{
     //ADVANCED PATTERNS(see this after doing JavaBasics5)

    //hollow rectangle
    /*public static void hollow_rectangle(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||i==rows||j==1||j==cols){ //boundary condition
                    System.out.print("*");
                   }else{
                    System.out.print(" ");
                   }
            }
            System.out.println();
        }
                
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);*/

    



    //inverted and rotated half pyramid
    /*public static void roat_halfPyr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ //stars
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
     public static void main(String args[]){
        roat_halfPyr(4);*/




    //inverted half pyramid with numbers
        /*
public static void inv_pyr(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }
               System.out.println();
            }
        }
           public static void main(String args[]){
            inv_pyr(5);*/




    //Floyd's Triangle
      /*public static void flo_tri(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
          }
          System.out.println();
        }
      }
         public static void main(String args[]){
            flo_tri(5);*/




    //0-1 triangle
    /*public static void ZeroOne_tri(int n){
       for(int i=1;i<=n;i++) {
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            }
        }
        System.out.println();
       }

    }
       public static void main(String args[]){
        ZeroOne_tri(5);*/




     //Butterfly Pattern
     /*public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n;i>=1;i--){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
             System.out.println();
        }
       
     }
     public static void main(String args[]){
        butterfly(5);*/




    //Solid Rhombus
        /*public static void sol_rhom(int n){
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            sol_rhom(5);*/




    //Hollow Rhombus
    /*public static void holl_rhom(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars(boundary condition)
           for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
    }
        public static void main(String args[]){
            holl_rhom(5);*/




    //Diamond
   public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++ ){
            //spaces
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
           }
           //stars
           for(int j=1;j<=(2*i)-1;j++){
                 System.out.print("*");
           }
           System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
           }
           //stars
           for(int j=1;j<=(2*i)-1;j++){
                 System.out.print("*");
           }
           System.out.println();
        }
   }
         
        
    
        
        public static void main(String args[]){
            diamond(5);
     


    //bonus live extra 2 questions

    //Number Pyramid
     /*public static void numberPyr(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();   
        }
       
     }
     public static void main(String args[]){
        numberPyr(5);*/

    

        
    //palindromic pattern with numbers
    /*public static void pp(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            for(int j=i;j>=1   ;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
            pp(5);*/
    
     



        





}
}

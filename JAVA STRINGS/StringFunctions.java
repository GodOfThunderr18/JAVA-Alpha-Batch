
public class StringFunctions {
    /*public static void main(String[] args) {

        //compare
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //if u want to check whether both strings have same value
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }*/


        //substring
        /*public static String substring(String str,int si,int ei){
            String substr="";
            for(int i=si;i<ei;i++){
                substr+=str.charAt(i);
            }
            return substr;
            
        }


        public static void main(String args[]){
            String str="Hello World";
            System.out.println(substring(str,0,7));
            //the above substring is done by us but java has inbuilt substring function 
            System.out.println(str.substring(0,7));

        }*/



        //compareTo and compareToIgnorecase
        public static void main(String args[]){
            String fruits[]={"apple","banana","mango"};
            String largest=fruits[0];
            for(int i=0;i<fruits.length;i++){
                if(largest.compareTo(fruits[i])<0){
                    largest=fruits[i];
                }
            }
            System.out.println(largest);   //TC(x*n)
        }



       
        


    }
    


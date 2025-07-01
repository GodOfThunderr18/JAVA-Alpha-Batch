//x^n  TC=O(n)
/*public class Recursion2 {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
       return x*power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,10 ));
        
    }
    
}*/

//X^n Optimized Tc=O(log n)
/*public class Recursion2 {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        //int ans=power(x,n/2)*power(x, n/2);  TC=O(n)  since 2 calls of power are there
        int halfpower=power(x,n/2);  //only one call for power so TC=O(logn) 
        int ans=halfpower*halfpower;

        //for odd case
        if(n%2!=0){
            ans=x*ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(power(2,10 ));
        
    }
}*/

//Tilling problem
/*public class Recursion2 {
    public static int tillingProblem(int n) {//2 x n (floor size)
    //base case
    if(n==1 || n==0){
        return 1;
    }
    //vertical choice
    int fnm1=tillingProblem(n-1);

    //horizontal choice
    int fnm2=tillingProblem(n-2);

    int totways=fnm1+fnm2;
    return totways;
}


    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
        
    }
}*/ 

//Remove duplicates in a string
/*public class Recursion2 {
    public static void RemoveDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){  //base case
            System.out.println(newstr);
            return;

        }
        //work
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){  //duplicate
            RemoveDuplicates(str,idx+1,newstr,map); //since its a duplicate we shouldnt add it to the new string and move to the next idx

        }else{  //i.e element is first occuring and its not a duplicate
            map[currChar-'a']=true; //since its not a duplicate update the map array as true and add the elementt to new string and move to next idx
            RemoveDuplicates(str,idx+1,newstr.append(currChar),map);

        }
 }

    public static void main(String[] args) {
        RemoveDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
        
    }
}*/


/*
  Friends Pairong problem
 */
/*public class Recursion2 {
    public static int friendsPairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }

        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int pairWays=(n-1)*fnm2;
        //totWays
        int totWays=fnm1+pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}*/


//Binary Strings problem
public class Recursion2 {
    public static void printBinaryStrings(int n,int LP,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;

        }
        
         //work
        /*if(LP==0){
            //sit 0 on chair n--now we can add 0 or 1 to its next chair
            printBinaryStrings(n-1,0, str+("0"));  //after adding 0 in next chair now the last place becomes 0 and we have to add the next remaining n-1 places
            printBinaryStrings(n-1,1, str+("1"));//after adding 1 in next chair now the last place becomes 1 and we have to add the next remaining n-1 places

        }else{
            printBinaryStrings(n-1,0, str+("0"));  //i.e if LP==1 then only one possiblity of adding 0 in next chair
        }*/

        //optimized
        printBinaryStrings(n-1, 0, str+"0");  //we can add 0 whether LP is 0 or 1 so no need to check condition
        if(LP==0){
            printBinaryStrings(n-1,1, str+"1");  //if LP==0 then we have the option to add 1 also so we mentioned the other option here
        }

    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0,"");
    }
}


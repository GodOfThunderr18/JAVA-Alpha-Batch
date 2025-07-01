import java.util.Arrays;

public class PractiseQuestions {

    /*public static int isLowerCase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
           }
        }
        return count;
    }
    public static void main(String args[]){
        String str="aeiou";
        System.out.println(isLowerCase(str));

    }*/

    /*public static void main(String args[]){
        String str="Sushanth";
        String str1="kartikeya";
        String str2="kartikeya";
        System.out.println(str.equals(str1)+" "+str1.equals(str2));
    }*/


    /*public static void main(String args[]){
        String str="ApnaCollege".replace("l","f");
        System.out.println(str);
    }*/


    /*public static void isAnagram(String str1,String str2){
        if(str1.length()==str2.length()){
            char str1CharArray[]=str1.toCharArray();
            char str2CharArray[]=str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean result=Arrays.equals(str1CharArray,str2CharArray);

            if(result){
                System.out.println("string 1 and string 2 are anagrams");
            }else{
                System.out.println("string 1 and string 2 are not anagrams");
            }
        }
        else{
            System.out.println("string 1 and string 2 are not anagrams");
        }
        
    }
    public static void main(String args[]){
        String str1="earth";
        String str2="heart";
        isAnagram(str1,str2);
    }*/


    //to check if  a string contains all vowels
public static boolean isVowels(String s){
    char a[]=s.toCharArray();
    for(int i=0;i<a.length;i++){
        if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u'){
               return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        String s="aeioug";
        System.out.println(isVowels(s));
        
    }
    
}

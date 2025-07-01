
public class Questions {
    /*public static boolean isPalindrome(String str){   //TC=O(n)
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)==str.charAt(n-i-1)){
                return true;
            }
        }
        return false;

    }
    public static void main(String args[]) {
        String str="noon";
        System.out.println(isPalindrome(str));

    }*/



    public static float ShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            
            char dir=str.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
     System.out.println(ShortestPath(path));
    }
}

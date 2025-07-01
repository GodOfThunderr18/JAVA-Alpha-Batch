

public class StringsBasic {

    public static void PrintName(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){

       /*  String str="abcd";  //output can be given directly by using str in Sopln
        Scanner sc=new Scanner(System.in);  //input
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(str);*/

        //concatenation and charAt
        String firstName="Sushanth";
        String secondName="Kartikeya";
        String Fullname=firstName+" "+secondName;
       // System.out.println(Fullname);
       // System.out.println(Fullname.charAt(3));

       PrintName(Fullname);


    }
    
}

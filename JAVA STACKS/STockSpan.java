import java.util.Stack;

public class STockSpan {
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int curr=stocks[i];
            while(!s.isEmpty()&&curr>=stocks[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                span[i]=i+1; //if stack becomes empty then the curr element is bigger than all elemensts on itds left hencwe its pan is its curr idx+1
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
       
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        //int stocks[]={100,80,60,110,60,85,100}; //for stack empty case this u run and se u will understand 
        int span[]=new int[stocks.length];
        stockSpan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");

        }

        
    }
    
}

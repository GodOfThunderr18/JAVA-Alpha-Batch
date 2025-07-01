import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxActivity {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
            

        }
        //lambda function
        Arrays.sort(activities,Comparator.comparingDouble(o-> o[2])); //since we want end time column to get sorted 




        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(activities[0][0]);//since 1st activity should always be included
        int count=1;//since already 1 activity i.e 1st one is included
        int prevEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=prevEnd){
                count++;
                ans.add(activities[i][0]);
                prevEnd=activities[i][2];
            }

        }
        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+"  ");
            
        }

    }
    
}

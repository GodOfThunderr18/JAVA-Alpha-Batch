import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id,int deadline,int profit){
            this.id=id; //A(0),B(1),C(3),D(4),....
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,20}};
        ArrayList<Job> jobs =new ArrayList<>(); //comsider Job as a new datatype with 3 elements
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //to sort objects use this
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //since we want descending of profits hence b-a,if asc then a-b
        ArrayList<Integer> res=new ArrayList<>(); //to store the jobs  
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){ //
                  res.add(curr.id);
                  time++;
            }
        }
        //print res
        System.out.println("Maximum jobs = "+res.size());
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();




    }
    
}

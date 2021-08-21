package solutionPackage;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class Solution_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<Integer>();
        
        for(int i=0 ; i<progresses.length ; i++){
            if((100 - progresses[i])%speeds[i]==0)
                que.offer((100 - progresses[i])/speeds[i]);
            else
                que.offer((100 - progresses[i])/speeds[i]+1);
        } // calculate day to finish
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        while(!que.isEmpty()){
            int f = que.poll();
            int ea = 1;
            for(int m : que){
                if(f>=m) ea++;
                else break;
            }
            for(int i=0 ; i<ea-1 ; i++)
                que.poll();   
 
            arrList.add(ea);
        }
        int[] answer = new int[arrList.size()];
        for(int i=0 ; i<arrList.size() ; i++)
            answer[i] = arrList.get(i);
        
        return answer;
    }
}
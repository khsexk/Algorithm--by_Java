package solutionPackage;
import java.util.Queue;
import java.util.LinkedList;

public class Solution_42587 {
    public int solution(int[] priorities, int location) {
        Queue<Printer> queue = new LinkedList<Printer>();
        int pnt = location;
        int answer = 1;
    
        for(int i=0 ; i<priorities.length ; i++)
            queue.offer(new Printer(i, priorities[i]));
        
        while(!queue.isEmpty()){
            Printer printer = queue.poll();
            boolean flag = false;
            
            for(Printer p : queue){
                if(p.priority>printer.priority){
                    flag = true;
                    queue.offer(printer);
                    break;
                }
            }
            if(!flag){
                if(printer.location == location)
                    return answer;
                else
                    answer++;
            }
        }  
        return answer;
    }
}
class Printer{
    int location;
    int priority;
    
    Printer(int location, int priority){
        this.location = location;
        this.priority = priority;
    }
    int get_loc(){
        return location;
    }
    int get_pri(){
        return priority;
    }
}
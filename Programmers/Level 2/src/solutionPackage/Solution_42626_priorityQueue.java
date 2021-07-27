package solutionPackage;
import java.util.*;

// 정답(시간 초과 해결)
public class Solution_42626_priorityQueue {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scv = new PriorityQueue<Integer>();
        
        for(int i : scoville)
            scv.offer(i);
        
        int answer = 0;
        int min = 0;
        
        while(true){
            min = (int)scv.peek();
            if(min>=K)
                break;
            if(scv.size() == 1)
                break;
            int newFood = (int)scv.poll() + (int)scv.poll()*2;
            scv.offer(newFood);
            answer++;
        }
        if(min<K)
            answer = -1;
        
        return answer;
    }
}

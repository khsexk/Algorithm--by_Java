package solutionPackage;
import java.util.Collections;
import java.util.ArrayList;

// 시간 초과로 인한 오답처리
public class Solution_42626_arrayList {
	public int solution(int[] scoville, int K) {
        ArrayList<Integer> scv = new ArrayList<Integer>();
        
        for(int i : scoville)
            scv.add(i);
        
        int answer = 0;
        
        while(true){
            Collections.sort(scv);
            if(scv.get(0)>=K)
                break;
            
            if(scv.size() == 1)
                break;
            int newFood = scv.get(0) + scv.get(1)*2;
            scv.remove(0);
            scv.remove(0);
            scv.add(newFood);
            answer++;
        }
        if(scv.get(0)<K)
            answer = -1;
        
        return answer;
    }
}
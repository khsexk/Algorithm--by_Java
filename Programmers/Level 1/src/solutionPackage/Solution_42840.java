package solutionPackage;

import java.util.ArrayList;
import java.util.HashMap;

class Solution_42840 {
    int[] select1 = {1, 2, 3, 4, 5};
    int[] select2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] select3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    
    public int[] solution(int[] answers) {
        grading(1, select1, answers);
        grading(2, select2, answers);
        grading(3, select3, answers);
        
        int max = 0;
        for(int key : map.keySet()){
            if(key >= max)
                max = key;
        }
        ArrayList<Integer> arr = map.get(max);
        
        int[] answer = new int[arr.size()];
        
        for(int i=0 ; i<arr.size() ; i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
    void grading(int no, int[] select, int[] answers){
        int idx = 0;
        int grade = 0;
        for(int a : answers){
            if(a == select[idx])
                grade++;
            idx++;
            if(idx == select.length)
                idx = 0;
        }
        if(!map.containsKey(grade)){
            map.put(grade, new ArrayList<Integer>());
        }
        map.get(grade).add(no);
    }
}
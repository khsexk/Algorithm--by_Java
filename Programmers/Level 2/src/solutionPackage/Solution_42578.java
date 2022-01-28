package solutionPackage;

import java.util.HashMap;

class Solution_42578 {
    public int solution(String[][] clothes) {
        HashMap<String, Double> map = new HashMap<>();
        
        // Put data in HashMap
        for(int i=0 ; i<clothes.length ; i++) {
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], 0.0);
            } 
            map.replace(clothes[i][1], map.get(clothes[i][1]) + 1);
        }
        
        int answer = 1;
        
        for(String key : map.keySet()){
            answer *= map.get(key)+1;  // key 종류의 의상 개수 + 1(안 입은 경우)
            
        }
        
        return answer-1;
    }
}
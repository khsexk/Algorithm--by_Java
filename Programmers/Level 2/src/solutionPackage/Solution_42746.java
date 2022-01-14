package solutionPackage;

// 가장 큰 수 

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Collections;

class Solution_42746 {
    public String solution(int[] numbers) {
        HashMap<Integer, LinkedList<Integer>> hm = new HashMap<>(); 
        LinkedList<Integer> keyList = new LinkedList<>();
        
        // 배열의 각 요소가 반복되게 4의 길이로 만들어 삽입
        for(int i : numbers){
            int f = changeLen(Integer.toString(i));
            
            if(!hm.containsKey(f)) {
                hm.put(f, new LinkedList<Integer>());
            }
            hm.get(f).add(i);
            
            if(!keyList.contains(f))
                keyList.add(f);
        }
        
        Collections.sort(keyList, Collections.reverseOrder());
        
        // 예외 처리
        if(keyList.get(0) == 0)
            return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(int key : keyList){
            LinkedList<Integer> valueList = hm.get(key);
            
            if(valueList.size() == 1)
                sb.append(valueList.get(0));
            else{
                Collections.sort(valueList, Collections.reverseOrder());
                
                for(int value : valueList)
                    sb.append(value);
            }
        }
        
        return sb.toString();
    }
    
    int changeLen(String s){
        StringBuilder sb = new StringBuilder(s);
        if(s.length() == 1) { sb.append(s).append(s).append(s); }
        else if(s.length() == 2) { sb.append(s); }
        else if(s.length() == 3) { sb.append(s.charAt(0)); }
        else { return Integer.parseInt(s); }
        
        return Integer.parseInt(sb.toString());
    }   // Method 
}

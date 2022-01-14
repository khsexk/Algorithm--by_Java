package solutionPackage;

// H-Index

import java.util.LinkedList;
import java.util.Collections;

class Solution_42747 {
    public int solution(int[] citations) {
        if(citations.length==1 && citations[0] == 1)
            return 1;
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i : citations)
            list.add(i);
        
        Collections.sort(list);
        
        int indexH = 0;
        
        for(int i=0 ; i<list.size() ; i++){
            int h = i;
            int limitH = list.get(i);
            int n = list.size() - i;	// 인용횟수가 h번 이상인 논문의 개수
            
            while(h<=limitH){
                if( (n >= h) && (h > indexH) )
                    indexH = h;
                h++;
            }
        }
        
        return indexH;
    }
}

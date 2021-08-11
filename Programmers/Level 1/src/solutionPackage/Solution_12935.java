package solutionPackage;
import java.util.ArrayList.*;
import java.util.*;

public class Solution_12935 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList();
        
        int min = arr[0];
        int minIdx = 0;
        
        for(int i=0 ; i<arr.length ; i++){
            arrList.add(arr[i]);
            if(min > arr[i]){
                minIdx = i;
                min = arr[i];
            }  
        }
        arrList.remove(minIdx);
        
        if(arrList.size() == 0){
            int[] re = {-1};
            return re;
        }
        int[] answer = new int[arrList.size()];
        for(int j=0 ; j<arrList.size() ; j++){
            answer[j] = arrList.get(j);
        }
        return answer;
    }
}
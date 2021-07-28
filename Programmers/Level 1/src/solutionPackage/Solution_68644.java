package solutionPackage;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution_68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList();
        
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                int sum = numbers[i] + numbers[j];
                if(!arrList.contains(sum))
                    arrList.add(sum);
            }
        }
        
        int[] answer = new int[arrList.size()];
        
        for(int i=0 ; i<arrList.size() ; i++)
            answer[i] = arrList.get(i);
        
        Arrays.sort(answer);
        return answer;
    }
}
package solutionPackage;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_12910 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList();
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%divisor == 0)
				arrList.add(arr[i]);
		}
		
		if(arrList.size()==0) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arrList.size()];
		
		for(int j=0 ; j<arrList.size(); j++) 
			answer[j] = arrList.get(j);
		Arrays.sort(answer);
		
        return answer;
    }
}
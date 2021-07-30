package solutionPackage;
import java.util.ArrayList;

public class Solution_12906 {
    public int[] solution(int []arr) {
		int len = arr.length;
		ArrayList arrList = new ArrayList<Integer>();
		
		for(int i=0 ; i<len ; i++) { 
			if(i==0) {
				arrList.add(arr[i]);
			}
			else if(i>0) {
				if(arr[i] != arr[i-1]) {
					arrList.add(arr[i]);
				}
			}
		}
		int[] answer = new int[arrList.size()];
		
		for(int j=0 ; j<arrList.size(); j++)
			answer[j] = (int)arrList.get(j);
		
		return answer;
    }
}
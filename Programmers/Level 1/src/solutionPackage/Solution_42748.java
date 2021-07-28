package solutionPackage;
import java.util.Arrays;

public class Solution_42748 {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int aswIndex = 0;
        
        for(int[] i : commands) {
        	int[] cutArray = new int[i[1]-i[0]+1];
        	int index = 0;
        	
        	for(int j=i[0]-1 ; j<i[1] ; j++) {
        		cutArray[index] = array[j];
        		index++;
        	}
            if(cutArray.length != 1)
        	    Arrays.sort(cutArray);
        	answer[aswIndex] = cutArray[i[2]-1];
        	aswIndex++;
        }
        return answer;
    }
}
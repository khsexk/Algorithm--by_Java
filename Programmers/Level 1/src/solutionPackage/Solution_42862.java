package solutionPackage;

public class Solution_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
		
		for(int i=0 ; i<lost.length ; i++) {
			for(int j=0 ; j<reserve.length ; j++) {
				if(lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
				}
			}
		}
		
		for(int i=0 ; i<lost.length ; i++) {
			for(int j=0 ; j<reserve.length ; j++) {
				if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
					reserve[j] = -1;
					answer++;
					break;
				}
			}	// for_j
		}	// for_i
		return answer;
    }
}
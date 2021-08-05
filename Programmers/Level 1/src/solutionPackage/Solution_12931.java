package solutionPackage;

public class Solution_12931 {
    public int solution(int n) {
        String s = Integer.toString(n);
        int answer = 0;
        
        for(int i=0 ; i<s.length() ; i++)
            answer += s.charAt(i) - '0';
            
        return answer;
    }
}
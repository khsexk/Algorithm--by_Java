package solutionPackage;

public class Solution_12916 {
    boolean solution(String s) {
		boolean answer;
		int p=0, y=0;
        for(int i=0 ; i<s.length(); i++) {
        	if(s.charAt(i)=='p' || s.charAt(i)=='P') 
        		p++;
        	else if(s.charAt(i)=='y' || s.charAt(i)=='Y')
        		y++;
        }
        if(p==y)
        	answer = true;
        else
        	answer = false;
        
        return answer;
    }
}
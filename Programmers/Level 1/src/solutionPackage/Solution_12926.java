package solutionPackage;

public class Solution_12926 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0 ; i<s.length() ; i++) {
        	if(s.charAt(i) == ' ') {
        		answer += ' ';
        	}
        	else if((int)s.charAt(i) >= 97) {
        		int c = (int)s.charAt(i);
        		for(int j=0 ; j<n ; j++) {
        			if(c == 122)
        				c = 97;
        			else
        				c++;
        		}
        		answer += (char)c;	
        	} // 소문자
        	else {
        		int c = (int)s.charAt(i);
        		for(int j=0 ; j<n ; j++) {
        			if(c == 90)
        				c = 65;
        			else
        				c++;
        		}
        		answer += (char)c;	
        	} // 대문자
        }
        return answer;
    }
}
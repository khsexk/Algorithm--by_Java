package solutionPackage;

public class Solution_12948 {
    public String solution(String phone_number) {
        int len = phone_number.length();
		String hide = "";
		
		for (int i=0 ; i<len-4 ; i++) 
			hide += '*';
		
		String answer = hide + phone_number.substring(len-4);
            
        return answer;
    }
}
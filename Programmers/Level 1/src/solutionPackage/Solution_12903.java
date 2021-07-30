package solutionPackage;

public class Solution_12903 {
    public String solution(String s) {
    	String answer = "";
    	int oddEven = s.length() % 2;
    	int len = s.length() / 2;
    	
    	if(oddEven==1) 
    		answer = new Character(s.charAt(len)).toString();
    	else {
    		char[] arr = new char[2];
    		arr[0] = s.charAt(len-1);
    		arr[1] = s.charAt(len);
    		
    		answer = String.valueOf(arr);
    	}
    		
        return answer;
    }
}
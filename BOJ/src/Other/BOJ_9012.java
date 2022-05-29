package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N != 0) {
			String tc = br.readLine();
			boolean flag = solutionStack(tc);
			
			if(flag) System.out.println("YES");
			else System.out.println("NO");
			
			N--;
		}
	}
	
    public static boolean solution(String s) {
        int openFlag = 0;
        int closeFlag = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '(')
                openFlag++;
            else if(s.charAt(i) == ')')
                closeFlag++;
            if(closeFlag > openFlag)
            	return false;
        }
        if(closeFlag==openFlag)
            return true;

        return false;
    }
    public static boolean solutionStack(String s) {
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i=0 ; i<s.length() ; i++) {
    		if(s.charAt(i) == '(') {
    			stack.push(s.charAt(i));
    		}
    		else if(stack.isEmpty())
    			return false;
    		else {
    			stack.pop();
    		}
    	}
    	if(stack.isEmpty())
    		return true;
    	else
    		return false;
    }
}

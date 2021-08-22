package solutionPackage;

public class Solution_12909 {
    boolean solution(String s) {
        int openFlag = 0;
        int closeFlag = 0;
        
        if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(')
            return false;
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '(')
                openFlag++;
            else if(s.charAt(i) == ')')
                closeFlag++;
            
            if(closeFlag>openFlag)
                return false;
        }
        
        if(closeFlag<openFlag)
            return false;

        return true;
    }
}
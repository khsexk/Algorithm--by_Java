package solutionPackage;

public class Solution_12918 {
    public boolean solution(String s) {
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)<48 || s.charAt(i)>57)
                return false;
        }
        if(s.length() == 4)
            return true;
        else if(s.length() == 6)
            return true;
        else
            return false;
    }
}
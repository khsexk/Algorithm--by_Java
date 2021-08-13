package solutionPackage;

public class Solution_12947 {
    public boolean solution(int x) {
        String s = Integer.toString(x);
        int y = 0;
        for(int i=0 ; i<s.length() ; i++)
            y += Character.getNumericValue(s.charAt(i));
        
        if(x%y==0)
            return true;
        else
            return false;
    }
}
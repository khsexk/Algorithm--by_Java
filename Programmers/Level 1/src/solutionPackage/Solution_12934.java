package solutionPackage;

public class Solution_12934 {
    public long solution(long n) {
        long m = (long)Math.sqrt((double)n);
        
        if(m != Math.sqrt((double)n))
            return -1;
        
        long answer = (long)Math.pow((double)m+1, 2);
        return answer;
    }
}
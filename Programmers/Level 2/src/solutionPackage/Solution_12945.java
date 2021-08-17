package solutionPackage;

public class Solution_12945 {
    public int solution(int n) {
        int a = 1;
        int b = 1;
        int answer = 0;
        
        for(int i=2 ; i<n ; i++){
            answer = (a + b)%1234567;
            a = b;
            b = answer;
        }
        return answer;
    }
}
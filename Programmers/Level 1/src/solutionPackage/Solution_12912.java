package solutionPackage;

public class Solution_12912 {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a==b){
            return (long)a;
        } else if(a>b){
            for(int i=b ; i<=a ; i++)
                answer +=i;
        } else{
            for(int i=a ; i<=b ; i++)
                answer += i;
        }
        
        return answer;
    }
}
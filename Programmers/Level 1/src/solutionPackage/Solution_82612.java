package solutionPackage;

public class Solution_82612 {
    public long solution(int price, int money, int count) {
        long total = 0;
        
        for(int i=1 ; i<=count ; i++)
            total += price*i;
        long answer = -1;
        
        if(money>=total)
            return 0;
        else
            answer = total-money;
        return answer;
    }
}
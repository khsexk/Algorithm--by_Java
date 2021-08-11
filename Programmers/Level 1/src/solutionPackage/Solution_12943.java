package solutionPackage;

public class Solution_12943 {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        
        if(num == 1)
            return 0;
        
        while(true){
            if(n%2 == 0){
                n /= 2;
                answer++;
                if(n==1)
                    break;
            }
            else{
                n = n*3 + 1;
                answer++;
            }
            if(answer == 500)
                return -1;
        }
        return answer;
    }
}
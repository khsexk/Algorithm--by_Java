package solutionPackage;
import java.util.Arrays;

public class Solution_12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        if(d[0] == budget)
            return 1;
        else if(d[0] > budget)
            return 0;
        
        int answer = 1;
        int totalB = d[0];

        for(int i=1 ; i<d.length ; i++){
            int guess = totalB+d[i];
            if(guess < budget){
                totalB += d[i];
                answer++;
            }
            else if(guess == budget){
                answer++;
                break;
            }
            else
                break;
        }
        return answer;
    }
}
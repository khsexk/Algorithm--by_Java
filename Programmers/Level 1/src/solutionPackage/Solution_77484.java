package solutionPackage;
import java.util.Arrays;

public class Solution_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int zero = 0;
        for(int i : lottos){
            if(i == 0)
                zero++;
        }
        
        int correct = 0;
        for(int i=0 ; i<6 ; i++){
            for(int j=0 ; j<6 ; j++){
                if(lottos[j]>win_nums[i])
                    break;
                else if(lottos[j]==win_nums[i]){
                    correct++;
                    break;
                } // else_if
            } // for_j
        }
        int[] answer = new int[2];
        
        answer[0] = rank(zero + correct);
        answer[1] = rank(correct);
        
        return answer;
    }
    int rank(int n){
        if(n==6) return 1;
        else if(n==5) return 2;
        else if(n==4) return 3;
        else if(n==3) return 4;
        else if(n==2) return 5;
        else return 6;
        
    }
}
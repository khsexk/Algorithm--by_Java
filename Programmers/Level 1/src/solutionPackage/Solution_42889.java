package solutionPackage;

public class Solution_42889 {
    public int[] solution(int N, int[] stages) {
        double[] fail = new double[N];
        
        for(int i=0 ; i<N ; i++){
            int noClear = 0;
            int stage = 0;
            
            for(int j=0 ; j<stages.length ; j++){
                if(stages[j] > i+1)
                    stage++;
                else if(stages[j] == i+1){
                    stage++;
                    noClear++;
                }   
            } // for_j
            double fP = (stage == 0) ? 0 : (double)noClear / (double)stage;
            fail[i] = fP;
        } // for_i
        
        int[] answer = new int[N];
        
        for(int i=0 ; i<N ; i++)
            answer[i] = i+1;
        
        for(int i=1 ; i<fail.length ; i++){
            int idx = i;
            int sS = answer[i];
            double save = fail[i];
            
            for(int j=i-1 ; j>=0 ; j--){
                if(save > fail[j]){
                    fail[idx] = fail[j];
                    answer[idx] = answer[j];
                    idx--;
                }
            }
            fail[idx] = save;
            answer[idx] = sS;
        }
        
        return answer;
    }
}
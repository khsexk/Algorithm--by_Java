package solutionPackage;

class Solution_42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1 ; i<=(int)Math.sqrt(yellow) ; i++){
            if(yellow % i == 0){
                int b = i*2 + (yellow/i)*2 + 4;
                
                if(b==brown){
                    answer[0] = yellow/i+2;
                    answer[1] = i+2;
                    break;
                }
            }
        } // for
    
        return answer;
    }
}
package solutionPackage;

public class Solution_12930 {
    public String solution(String s) {
        String[] cut = s.split("");
        String answer = "";
        int space = 0;
        
        for(int j=0 ; j<cut.length ; j++){
            if(cut[j].equals(" "))
                space = 0;
            else{
                if(space%2 == 0){
                    space++;
                    cut[j] = cut[j].toUpperCase();
                }
                else{
                    space++;
                    cut[j] = cut[j].toLowerCase();
                }
            }
            answer += cut[j];
        }
        return answer;
    }
}
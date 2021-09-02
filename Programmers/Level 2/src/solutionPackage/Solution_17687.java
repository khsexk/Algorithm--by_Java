package solutionPackage;

public class Solution_17687 {
    public String solution(int n, int t, int m, int p) {
        int len = m*t + p;
        StringBuilder sb = new StringBuilder(len);
        sb.append(0);
        
        int gameNum = 0;
        
        while(sb.length() < len){
            String changeNotation = "";
            int num = gameNum;
            
            while(num != 0){
                int rmn = num%n;
                
                if(rmn >= 10)
                    changeNotation += String.valueOf((char)((rmn-10) + 65));
                else
                    changeNotation += String.valueOf(rmn);
                num /= n;
            }   // while_num
            sb.append(new StringBuilder(changeNotation).reverse());
            gameNum++;
        }   // while_sb

        String answer = "";
        int put = p;
        
        while(answer.length() < t){
            answer += sb.substring(put-1, put);
            put += m;
        }
        
        return answer;
    } 
}
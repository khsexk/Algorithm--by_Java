package solutionPackage;

public class Solution_12951 {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] str = s.split(" ");
        String answer = "";
        
        for(int i=0 ; i<str.length ; i++){
            String ss = str[i];
            if("".equals(ss)){
                answer += " ";
            } 
            else if(ss.charAt(0) >= 'a' && ss.charAt(0) <= 'z'){
                answer += ss.substring(0, 1).toUpperCase() + ss.substring(1);
                if(i < str.length-1)
                    answer += " ";
            } 
            else{
                answer += ss;
                if(i < str.length-1)
                    answer += " ";
            }
        } // for_i
        if(s.endsWith(" "))
            answer += " ";

        return answer;
    }
}
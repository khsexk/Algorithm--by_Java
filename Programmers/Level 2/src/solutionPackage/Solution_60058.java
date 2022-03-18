package solutionPackage;

public class Solution_60058 {
    public String solution(String p) {
        String answer = "";
        if(p.length() == 0)
            return "";
        
        String[] uv = separateUV(p);
        boolean flag = checkCorrect(uv);
        
        if(flag){
            answer = (uv[0] + solution(uv[1]));
        }
        else{
            answer += ("(" + solution(uv[1]) + ")");
            
            if(uv[0].length() != 2){  
                uv[0] = uv[0].substring(1, uv[0].length()-1);

                StringBuilder sb = new StringBuilder();
                
                for(int i=0 ; i<uv[0].length() ; i++){
                    if(uv[0].charAt(i) == '(')
                        sb.append(')');
                    else
                        sb.append('(');
                }

                answer += sb.toString();
            }
        }

        return answer;
    }
    
    String[] separateUV(String s){
        String[] arr = new String[2];
        int in = 0, out = 0;
        
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='(')
                in++;
            else
                out++;
            if(in == out){
                arr[0] = s.substring(0, i+1);
                arr[1] = s.substring(i+1, s.length());
                break;
            }
        } // for_i
        return arr;
    } // method
    
    boolean checkCorrect(String[] uv){
        return (uv[0].charAt(uv[0].length()-1) == ')') ? true:false;
    }
}

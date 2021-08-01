package solutionPackage;

public class Solution_17682 {
    public int solution(String dartResult) {
        int[] point = new int[3];
        int idx = 0;
        
        for(int i=0 ; i<dartResult.length() ; i++){
            char c = dartResult.charAt(i);
            int pnt = 0;
            
            // 숫자일 때 포인터에 넣기
            if(c >= '0' && c<='9'){
                if(c=='1' && dartResult.charAt(i+1)=='0'){
                    pnt = 10;
                    i++;
                } else
                    pnt = Character.getNumericValue(c);
                point[idx] = pnt;
                idx++;
            }
            else if(c == 'S'){
                ;
            }
            else if(c == 'D'){
                pnt = (int)Math.pow(point[idx-1], 2);
                point[idx-1] = pnt;
            }
            else if(c == 'T'){
                pnt = (int)Math.pow(point[idx-1], 3);
                point[idx-1] = pnt;
            }
            else if(c == '*'){
                if(idx==1)
                    point[0] *= 2;
                else{
                    point[idx-1] *= 2;
                    point[idx-2] *= 2;
                }
            }
            else if(c == '#'){
                point[idx-1] *= -1;
            }
        } // for_i
        
        int answer = point[0] + point[1] + point[2];
        
        return answer;
    }
}
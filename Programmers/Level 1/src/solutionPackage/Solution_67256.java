package solutionPackage;
import java.util.HashMap;

public class Solution_67256 {
	public String solution(int[] numbers, String hand) {
        HashMap<Integer, Integer> leftThumb = new HashMap();
        HashMap<Integer, Integer> rightThumb = new HashMap();
        HashMap<Integer, Integer> center = new HashMap();
        
        leftThumb.put(-1, 1);   // '*'
        leftThumb.put(7, 2);
        leftThumb.put(4, 3);
        leftThumb.put(1, 4);
        
        rightThumb.put(-1, 1);  // '#'
        rightThumb.put(9, 2);
        rightThumb.put(6, 3);
        rightThumb.put(3, 4);
        
        center.put(0, 1);
        center.put(8, 2);
        center.put(5, 3);
        center.put(2, 4);
        
        String answer = "";
        int lposition = -1;
        int rposition = -1;
        
        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer += "L";
                lposition = numbers[i];
            }
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                answer += "R";
                rposition = numbers[i];
            }
            else{
                int leftDtc = 0;
                int rightDtc = 0;
                
                // 왼쪽 거리 구하는 부분
                if(leftThumb.containsKey(lposition))
                    leftDtc = Math.abs(leftThumb.get(lposition) - center.get(numbers[i])) + 1;
                else
                    leftDtc = Math.abs(center.get(lposition) - center.get(numbers[i]));
                
                // 오른쪽 거리 구하는 부분
                if(rightThumb.containsKey(rposition))
                    rightDtc = Math.abs(rightThumb.get(rposition) - center.get(numbers[i])) + 1;
                else
                    rightDtc = Math.abs(center.get(rposition) - center.get(numbers[i]));
                
                // 거리 비교
                if(leftDtc > rightDtc){
                    answer += "R";
                    rposition = numbers[i];
                }   // L>R
                else if(leftDtc == rightDtc){
                    if(hand.equals("left")){
                        answer += "L";
                        lposition = numbers[i];
                    }
                    else if(hand.equals("right")){
                        answer += "R";
                        rposition = numbers[i];
                    }
                }   // ==
                else{
                    answer += "L";
                    lposition = numbers[i];
                }   // L<R
            }
        } // for_i
        return answer;
    }
}
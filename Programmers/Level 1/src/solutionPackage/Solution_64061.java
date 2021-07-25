package solutionPackage;
import java.util.ArrayList;

// 2019 카카오 개발자 겨울 인턴십 → 크레인 인형뽑기 게임

class Solution_64061 {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> select = new ArrayList<Integer>();
        
        for(int i=0 ; i<moves.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                if(board[j][moves[i]-1] != 0){
                    select.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            } // for_j
        } // for_i
        int answer = 0;
        
        while(true){
            int sameD = bombCheck(select);
            if(sameD == -1)
                break;
            else{
                select.remove(sameD);
                select.remove(sameD);
                answer += 2;
            }
        }
        return answer;
    }
    
    public int bombCheck(ArrayList sel) {
        int bomb = 0;
        for(int i=0 ; i<sel.size()-1 ; i++){
            if(sel.get(i) == sel.get(i+1)){
                bomb = i;
                return bomb;
            }
        }
        bomb = -1;
        return bomb;
    } // bombCheck
}
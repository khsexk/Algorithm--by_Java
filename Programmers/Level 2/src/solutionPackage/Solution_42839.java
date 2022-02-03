package solutionPackage;

import java.util.ArrayList;

class Solution_42839 {
    boolean[] visited = new boolean[7];
    ArrayList<Integer> primeArr = new ArrayList<>();
    
    public int solution(String numbers) { 
        String s = "";
        
        for(int i=1 ; i<=numbers.length() ; i++){
            per(numbers, s, i);
        }
        return primeArr.size();
    }
    
    void per(String numbers, String s, int r){
        
        if(s.length() == r){
            int num = Integer.parseInt(s);
            if(!primeArr.contains(num) && isPrime(num))	primeArr.add(num);
            return;
        }
        for(int i=0 ; i<numbers.length() ; i++){
            if(!visited[i]){
                visited[i] = true;
                s += numbers.charAt(i);
                per(numbers, s, r);
                visited[i] = false;
                s = s.substring(0, s.length()-1);
            }
        }
    }
    
    boolean isPrime(int num){
        if(num==0 || num==1) return false;
        int limit = (int)Math.sqrt(num) + 1;
        
        for(int i=2 ; i<limit ; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}

/*
 * 이유는 모르겠지만, StringBuilder를 쓰다가 String으로 바꾸니 돌아갔다... 
 * 두 클래스가 다른건 알겠는데, 왜 StringBuilder로는 안되는지 좀 더 생각해봐야겠다.
*/
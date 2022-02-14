package solutionPackage;

public class Solution_43163 {
    int min = 100;
    boolean[] visited;
    
    public int solution(String begin, String target, String[] words) {
        boolean flag = false;
        
        for(String s : words){
            if(target.equals(s))
                flag = true;
        }
        
        if(!flag)   return 0;
        
        visited = new boolean[words.length];
        
        dfs(begin, words, target, 0);
        
        return min;
    }
    
    void dfs(String start, String[] words, String target, int cnt){
        if(start.equals(target)){
            if(cnt < min)
                min = cnt;
            return;
        }
        
        for(int i=0 ; i<words.length ; i++){
            if(!visited[i]){
                int match = 0;
                for(int j=0 ; j<start.length() ; j++){
                    if(start.charAt(j) == words[i].charAt(j))
                        match++;
                }
                
                if(match == start.length()-1){
                    visited[i] = true;
                    dfs(words[i], words, target, cnt+1);
                    visited[i] = false;
                }
            }
        } // for_i
    } // dfs
}

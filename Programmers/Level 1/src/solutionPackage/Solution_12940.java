package solutionPackage;

public class Solution_12940 {
    public int[] solution(int n, int m) {
        int l=0, s=0;
        int[] answer = new int[2];
        
        if(n>=m){
            l = n;
            s = m;
        } else{
            l = m;
            s = n;
        } 
        answer[0] = gcd(l, s);
        answer[1]= l*s/answer[0];
        
        return answer;
    }
    int gcd(int l, int s){
        return (l%s == 0) ? s : gcd(s,l%s);
    }
}
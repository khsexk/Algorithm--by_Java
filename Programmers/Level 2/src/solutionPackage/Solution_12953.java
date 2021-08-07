package solutionPackage;
import java.util.Arrays;

public class Solution_12953 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int lcm = arr[0];
        
        for(int i=1 ; i<arr.length ; i++){
            int n=0;
            int m=0;
            
            if(lcm>arr[i]){
                n=lcm;
                m=arr[i];
            } else{
                n=arr[i];
                m=lcm;
            }
            int gcdNum = gcd(n, m);
            lcm = n*m/gcdNum;
        }
        return lcm;
    }
    int gcd(int n, int m){
        return n%m == 0 ? m : gcd(m, n%m);
    }
}
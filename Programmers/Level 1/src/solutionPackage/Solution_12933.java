package solutionPackage;
import java.util.Arrays;
import java.util.Collections;

public class Solution_12933 {
    public long solution(long n) {
        String s = String.valueOf(n);
        Integer[] arr = new Integer[s.length()];
        
        for(int i=0 ; i<s.length() ; i++)
            arr[i] = Character.getNumericValue(s.charAt(i));
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String ans = "";
        for(int j=0 ; j<s.length() ; j++)
            ans += Integer.toString(arr[j]);
        
        long answer = Long.parseLong(ans);
        return answer;
    }
}
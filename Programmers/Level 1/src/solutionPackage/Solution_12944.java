package solutionPackage;

public class Solution_12944 {
    public double solution(int[] arr) {
        int sum = 0;
        int len = arr.length;
        
        for(int i : arr)
            sum += i;
        
        return (double)sum / (double)len;
    }
}
package solutionPackage;

public class Solution_12977 {
    public int solution(int[] nums) {
        int sum=0;
        int answer = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum))
                          answer++;
                } // for_k
            } // for_j        
        } // for_i
        return answer;
    }
    public boolean isPrime(int num) {
        for(int i=2 ; i<num ; i++){
            if(num%i == 0)
                return false; 
        }
        return true;
    }
}
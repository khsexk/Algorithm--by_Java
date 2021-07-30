package solutionPackage;
import java.util.HashSet;

public class Solution_1845 {
    public int solution(int[] nums) {
        HashSet<Integer> kindOfPocketmon = new HashSet<>();
        
        for(int i=0 ; i<nums.length ;i++)
        	kindOfPocketmon.add(nums[i]);
  
        int answer = 0;
        
        if(kindOfPocketmon.size() > nums.length/2)
            answer = nums.length/2;
        else
            answer = kindOfPocketmon.size();
        return answer;
    }
}
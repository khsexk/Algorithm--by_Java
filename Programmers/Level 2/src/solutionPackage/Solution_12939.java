package solutionPackage;

public class Solution_12939 {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int max = Integer.parseInt(nums[0]);
        int min = Integer.parseInt(nums[0]);
        
        for(String num : nums){
            if(Integer.parseInt(num) > max)
                max = Integer.parseInt(num);
            if(Integer.parseInt(num) < min)
                min = Integer.parseInt(num);
        }
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}
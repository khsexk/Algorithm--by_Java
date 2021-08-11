package solutionPackage;

public class Solution_12937 {
    public String solution(int num) {
        String answer = "";
        if (num == 0 || num%2 == 0)
            answer = "Even";
        else
            answer = "Odd";
        return answer;
    }
}
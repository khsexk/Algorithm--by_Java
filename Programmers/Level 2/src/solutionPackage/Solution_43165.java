package solutionPackage;

public class Solution_43165 {
    int[] numbers;
    int target;
    int answer = 0;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        int sum = numbers[0];
        
        dfs(0, 0);
        
        return answer;
    }
    void dfs(int idx, int sum){
        if(idx == numbers.length){
            if(sum == target)
                answer++;
            return;
        }
        
        sum += numbers[idx];
        dfs(idx+1, sum);
        sum -= ( numbers[idx] * 2 );
        dfs(idx+1, sum);
    }
}

/*
 * 	탐색하면서 가감하는 옵션이 있기에 dfs 선택
 * 	+와 -, 두 가지 방향으로 재귀 호
 */

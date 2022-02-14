package solutionPackage;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution_43162 {
    ArrayList<Integer>[] adjList;
    boolean[] visited;
    int network = 0;
    
    public int solution(int n, int[][] computers) {
        adjList = new ArrayList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) 
			adjList[i] = new ArrayList<Integer>(); 
        
        for(int i=0 ; i<computers.length ; i++){
            for(int j=0 ; j<computers.length ; j++){
                  adjList[i].add(computers[i][j]);
            } // for_j
        } // for_i
        
        for(int i=0 ; i<n ; i++){
            if(!visited[i]){
                bfs(i);
                network++;
            }
        }
        return network;
    }
    void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.offer(v);
        
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0 ; i<adjList.length ; i++){
                if(!visited[i] && i!=node && adjList[node].get(i)==1){
                    visited[i] = true;
                    q.offer(i);
                }
            } // for
        } // while
    } // bfs
}

/*/
	공부했던 이론대로 문제를 풀었다. 조건이 없고, 탐색에만 집중을 하면 bfs가 빠르다는 생각에 bfs로 구현하였는데, 사실 computers라는 배열 자체가 인접행렬이었기 때문에
	그대로 이용하는 편이 더 빨랐을 것 같다. 하지만 인접리스트가 더 익숙해서 인접리스트로 변환하여 문제를 풀었고, 문제는 맞았지만 그대로 사용한 밑의 코드와 속도 차이가 0.2ms,
	많게는 1ms까지 났다. (시간초과 오답이 아닌 이유는 문제 출제 의도가 '인접행렬과 인접리스트 중 골라서 풀어라'였던 것 같다... ⬅️ 억측)  

[출처: https://fbtmdwhd33.tistory.com/237]
public class Solution {
	public int solution(int n, int[][] computers) {
    
		int answer = 0;
		boolean[] check = new boolean[n]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				dfs(computers, i, check);
				answer++;
			}
		}
		return answer;
	}

	boolean[] dfs(int[][] computers, int i, boolean[] check) {
		check[i] = true;

		for (int j = 0; j < computers.length; j++) {
			if (i != j && computers[i][j] == 1 && check[j] == false) {
				check = dfs(computers, j, check);
			}
		}
		return check;
	}
}
*/
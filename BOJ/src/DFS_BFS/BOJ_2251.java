package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2251 {
	static ArrayList<Integer> resultCase = new ArrayList<>();
	static int[] capacities = new int[3];
	static boolean[][] visited = new boolean[201][201];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		capacities[0] = Integer.parseInt(st.nextToken());
		capacities[1] = Integer.parseInt(st.nextToken());
		capacities[2] = Integer.parseInt(st.nextToken());
		
		dfs(0, 0, capacities[2]);
		Collections.sort(resultCase);
		
		for(int i : resultCase)
			System.out.print(i + " ");
	}
	public static void dfs(int A, int B, int C) {
		if(visited[A][B]) return;
		
		
		if(A == 0 && !resultCase.contains(C)) 
			resultCase.add(C);
		
		visited[A][B] = true;
		
		// A -> B
		if(A+B >= capacities[1]) {
			dfs(A - (capacities[1]- B), capacities[1], C);
		} else {
			dfs(0, A+B, C);
		}
		// A -> C
		if(A+C >= capacities[2]) {
			dfs(A - (capacities[2]- C), B, capacities[2]);
		} else {
			dfs(0, B, A+C);
		}
		
		// B -> A
		if(B+A >= capacities[0]) {
			dfs(capacities[0], B - (capacities[0]- A), C);
		} else {
			dfs(A+B, 0, C);
		}
		// B -> C
		if(B+C >= capacities[2]) {
			dfs(A, B - (capacities[2]- C), capacities[2]);
		} else {
			dfs(A, 0, B+C);
		}
		
		// C -> A
		if(A+C >= capacities[0]) {
			dfs(capacities[0], B, C - (capacities[0] - A));
		} else {
			dfs(A+C, B, 0);
		}
		// C -> B
		if(B+C >= capacities[1]) {
			dfs(A, capacities[1], C - (capacities[1] - B));
		} else {
			dfs(A, B+C, 0);
		}
	}

}

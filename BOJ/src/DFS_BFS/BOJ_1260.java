package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1260 { 
	static StringTokenizer st;
	static ArrayList<Integer>[] arr; 
	static ArrayList<Integer> dfsResult; 
	static ArrayList<Integer> bfsResult; // bfs 결과 
	static boolean[] visited; // 방문여부 체크 
	
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken()); 
		int V = Integer.parseInt(st.nextToken()); 
		arr = new ArrayList[N+1]; 
		
		for(int i = 0; i <= N; i++) 
			arr[i] = new ArrayList<>(); 
		
		for(int i = 0; i < M; i++) { 
			st = new StringTokenizer(br.readLine(), " ");
			int node1 = Integer.parseInt(st.nextToken()); 
			int node2 = Integer.parseInt(st.nextToken()); 
			arr[node1].add(node2); 
			arr[node2].add(node1); 
		} 
		
		for(List<Integer> node : arr) 
			Collections.sort(node); 
		
		dfsResult = new ArrayList<>(); 
		bfsResult = new ArrayList<>(); 
		visited = new boolean[N + 1]; 
		
		dfs(V); 
		Arrays.fill(visited, false); 
		bfs(V); 
		
		// === 결과 출력 === 
		for(int i = 0; i < dfsResult.size(); i++){ 
			System.out.print(dfsResult.get(i) + " "); 
		} 
		System.out.println(); 
		
		for(int i = 0; i < bfsResult.size(); i++){ 
			System.out.print(bfsResult.get(i) + " "); 
		} 
	}
	
	public static void dfs(int node){ 
		if(visited[node]) return;
		
		visited[node] = true; 
		dfsResult.add(node); 

		for(int x : arr[node]){ 
			if(!visited[x]) 
				dfs(x); 
		} 
	} 
	
	public static void bfs(int root){ 
		Queue<Integer> q = new LinkedList<>(); 

		q.offer(root); 
		visited[root] = true; 

		while(!q.isEmpty()){ 
			int v = q.poll(); 

			bfsResult.add(v); 

			for(int y : arr[v]){ 
				if(!visited[y]) { 
					visited[y] = true; 
					q.add(y); 
				} 
			} 
		} 
	} 
}
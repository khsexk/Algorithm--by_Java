package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18352 {
	static StringTokenizer st;
	static boolean[] visited = new boolean[300001];
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int[] distance = new int[300001];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<Integer>()); 
			distance[i] = 300001;
		}
		
		distance[X] = 0;
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			list.get(s).add(f);
		}
		
		bfs(list, X, 0, K);
		int count = 0;
		for(int i=1 ; i<=N ; i++) {
			if(distance[i]==K)
				System.out.println(i);
			else
				count++;
		}
		if(count==N)
			System.out.println(-1);
		
	}
	
	static void bfs(ArrayList<ArrayList<Integer>> list, int start, int cnt, int limit) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int s = q.poll();
			
			for(int node : list.get(s)) {
				if(!visited[node]) {
					if(cnt < distance[node]) {
						distance[node] = cnt + 1;
						visited[node] = true;
						bfs(list, node, cnt+1, limit);
						visited[node] = false;
					}
				}
			} // forEach
		} // while
	}
}

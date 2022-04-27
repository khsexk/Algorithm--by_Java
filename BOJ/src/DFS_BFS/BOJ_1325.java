package DFS_BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1325 {
	static int N, M;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	static int max=0;
	static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		result = new int[N];
		
		
		for(int i=0 ; i<N ; i++) {
			arr.add(new ArrayList<>());
			result[i] = 0;
		}
		for(int i=0 ; i<M ; i++) {
			String[] link = br.readLine().split(" ");
			arr.get(Integer.parseInt(link[0])-1).add(Integer.parseInt(link[1])-1);
		}
		for(int i=0 ; i<N ; i++) {
			bfs(i);
		}
		for(int i=0 ; i<N ; i++) {
			max = result[i]>max ? result[i]:max;
		}
		
		for(int i=0 ; i<N ; i++) {
			if(result[i] == max)
				bw.write((i+1) + " ");;
		}
		bw.flush();
		bw.close();
		
	}
	static void bfs(int root) {
		boolean[] visited = new boolean[N];
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(root);
		visited[root] = true;
		result[root]++;
		
		while(!q.isEmpty()) {
			int r = q.poll();
			
			for(int k : arr.get(r)) {
				if(!visited[k]) {
					q.offer(k);
					visited[k] = true;
					result[k]++;
				}
			}
		}
	}

}

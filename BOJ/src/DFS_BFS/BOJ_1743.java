package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1743 {
	static ArrayList<int[]> arr;
	static boolean[][] trashMap;
	static boolean[][] visited;
	static int largestTrash = 0;
	static int cnt = 0, N, M;
	static int[] xPoint = {-1, 1, 0, 0};
	static int[] yPoint = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		trashMap = new boolean[N+1][M+1];
		visited = new boolean[N+1][M+1];
		arr = new ArrayList<>();
		
		// 데이터 삽입 
		for(int i=0 ; i<K ; i++) {
			String[] trashNode = br.readLine().split(" ");
			int[] node = {Integer.parseInt(trashNode[0]), Integer.parseInt(trashNode[1])};

			trashMap[node[0]][node[1]] = true;
			arr.add(node);
		}
		
		for(int[] trashNode : arr) {
			if(!visited[trashNode[0]][trashNode[1]]) {
				cnt = 0;
				bfs(trashNode[0], trashNode[1]);
				largestTrash = cnt > largestTrash ? cnt : largestTrash;
			}
		} // for-each
		
		System.out.println(largestTrash);
	} // main
	public static void bfs(int x, int y){ 
		Queue<Trash> queue = new LinkedList<>();
		queue.offer(new Trash(x, y));
		
		visited[x][y] = true; 
		cnt++;
		
		while(!queue.isEmpty()) {
			Trash t = queue.poll();
			
			for(int k=0 ; k<4 ; k++) {
				int xp = t.x + xPoint[k];
				int yp = t.y + yPoint[k];
				
				if(xp<1 || yp<1 || xp>N || yp>M) continue;
				
				if(!visited[xp][yp] && trashMap[xp][yp]) {
					visited[xp][yp] = true;
					queue.offer(new Trash(xp, yp));
					cnt++;
				}	
			} // for_k
		} // while-queue
	} 
}

class Trash{
	int x;
	int y;
	Trash(int x, int y){
		this.x = x;
		this.y = y;
	}
}
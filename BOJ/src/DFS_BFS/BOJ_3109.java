package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_3109 {
	static int R, C;
	static int cnt=0;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		visited = new boolean[R][C];
		
		
		for(int i=0 ; i<R ; i++) {
			String[] arr = br.readLine().split("");
			
			for(int j=0 ; j<C ; j++) {
				if(arr[j].equals("x"))
					visited[i][j] = true;
			} // for_j
		} // for_i
		
		for(int i=0 ; i<R ; i++) {
			if(dfs(i, 0))
				cnt++;
		}
		
		System.out.println(cnt);
	}
	static boolean dfs(int x, int y) {
		visited[x][y] = true;
		
		if(y == C-1) {
			return true;
		}
		
		if(x > 0 && !visited[x-1][y+1]) 
			if(dfs(x-1, y+1))
				return true;
		if(!visited[x][y+1]) 
			if(dfs(x, y+1))
				return true;
		if(x+1<R && !visited[x+1][y+1])
			if(dfs(x+1, y+1))
				return true;
		return false;
	}
}
/*
static void dfs(int x, int y) {
	visited[x][y] = true;
	
	if(y == C-1) {
		cnt++;
		return true;
	}
	
	if(x > 0 && !visited[x-1][y+1]) 
		dfs(x-1, y+1)
	else if(!visited[x][y+1]) 
		dfs(x, y+1)
	else if(x+1<R && !visited[x+1][y+1])
		dfs(x+1, y+1)

}
*/
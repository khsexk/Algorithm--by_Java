package DFS_BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class DfsAndBfs1260 { 
	static List<Integer>[] arr; // 인접 리스트 표현 
	static List<Integer> dfsResult; // dfs 결과 
	static List<Integer> bfsResult; // bfs 결과 
	static boolean[] check; // 방문여부 체크 
	public static void main(String[] args) { 
		// === 입력 === 
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int len = sc.nextInt(); 
		int start = sc.nextInt(); 
		arr = new List[n + 1]; 
		
		for(int i = 0; i <= n; i++) 
			arr[i] = new ArrayList<>(); 
		
		for(int i = 0; i < len; i++) { 
			int n1 = sc.nextInt(); 
			int n2 = sc.nextInt(); // 양방향 모두 표시 
			arr[n1].add(n2); 
			arr[n2].add(n1); 
			} 
		sc.close(); 
		// === 구현 === 
		// 인접 리스트 정렬 ( 작은수부터 방문하기 위해 ) 
		for(List<Integer> node : arr) 
			Collections.sort(node); 
		dfsResult = new ArrayList<>(); 
		bfsResult = new ArrayList<>(); 
		check = new boolean[n + 1]; 
		dfs(start); 
		// dfs 시작점 부터 
		Arrays.fill(check, false); 
		// check 전부 false로 초기화 
		bfs(start); 
		//bfs 시작점 부터 
		// === 결과 출력 === 
		for(int i = 0; i < dfsResult.size(); i++){ 
			System.out.print(dfsResult.get(i) + " "); 
			} 
		System.out.println(); 
		for(int i = 0; i < bfsResult.size(); i++){ 
			System.out.print(bfsResult.get(i) + " "); 
			} 
		} // 깊이우선 
	public static void dfs(int idx){ 
		if(check[idx]) return; 
		check[idx] = true; 
		// 현재 위치 방문처리 
		dfsResult.add(idx); 
		// 결과에 현재 위치 추가 
		// 현재 노드에서 방문 가능한 노드중에 아직 방문 안한 노드 재귀호출 
		for(int x : arr[idx]){ 
			if(!check[x]) dfs(x); 
			} 
		} 
	// 너비우선 
	public static void bfs(int start){ 
		Queue<Integer> q = new LinkedList<>(); 
		// 방문할 노드를 저장하는 용도 
		q.offer(start); 
		// 처음 값 추가 
		check[start] = true; 
		// 처음 값 방문처리 
		while(!q.isEmpty()){ 
			int x = q.poll(); 
			// 먼저 삽입된 값 
			bfsResult.add(x); 
			// 결과 추가 
			// 현재 노드에서 방문 가능한 노드중에 아직 방문 안한 노드 체크하며 큐에 추가 
			for(int y : arr[x]){ 
				if(!check[y]) { 
					check[y] = true; q.add(y); 
					} 
				} 
			} 
		} 
	}
		}
	}
}


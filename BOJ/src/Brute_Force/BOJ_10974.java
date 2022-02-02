package Brute_Force;

// 순열
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_10974 {
	static boolean[] visited;
	static int[] arr;
	static int[] output;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		visited = new boolean[N];
		arr = new int[N];
		output = new int[N];
		
		for(int i=1 ; i<=N ; i++) {
			arr[i-1] = i;
			visited[i-1] = false;
		}
		
		permutation(arr, output, visited, 0, N, N);
		
		br.close();
	}
	static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if(depth == output.length) {
			print(output);
			return;
		}
		
		for(int i=0 ; i<n ; i++) {
			if(!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(arr, output, visited, depth+1, n, n);
				visited[i] = false;
			}
		} //for
	}
	
	static void print(int[] arr) {
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}

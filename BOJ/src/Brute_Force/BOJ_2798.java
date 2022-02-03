package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {	
	static int max = 0;
	static int limit;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		limit = Integer.parseInt(st.nextToken());
		
		String[] sArr = br.readLine().split(" ");
		int[] cards = new int[N];
		boolean[] visited = new boolean[N];
		
		for(int i=0 ; i<N ; i++)
			cards[i] = Integer.parseInt(sArr[i]);
		
		int[] output = new int[N];
		
		recursive(cards, output, visited, 0, N, 3);
		
		System.out.println(max);
	}
	static void recursive(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			int sum = sum(output, r);
			if(sum > max && limit>=sum)
				max = sum;
			return;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				recursive(arr, output, visited, depth+1, n, r);
				visited[i] = false;
			}
		}
	}	// recursive
	static int sum(int[] output, int r) {
		int sum = 0;
		for(int j=0 ;j<r;j++)
			sum += output[j];
		return sum;
	}
}

/*
 *  순열을 외워버렸다,,,
 */
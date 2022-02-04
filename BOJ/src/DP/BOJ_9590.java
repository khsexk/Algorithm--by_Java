package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9590 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		
		for(int i=3 ; i<11 ; i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		
		for(int i=0 ; i<N ; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(dp[num-1]);
		}
	}

}


// 1 → 1
// 2 → 2
// 3 → 4
// 4 → 7
// 5 → 13

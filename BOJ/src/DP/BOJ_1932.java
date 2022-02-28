package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int floor = Integer.parseInt(br.readLine());
		
		int idx = 0;
		int[][] dp = new int[floor+1][floor+1];
		dp[1][1] = Integer.parseInt(br.readLine()); // 첫번째 값 저장
		
		for(int i=2 ; i<=floor ; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=1 ; j<=i ; j++) {
				int value = Integer.parseInt(s[j-1]);
				if(j==1) {
					dp[i][j] = dp[i-1][j] + value;
				}
				else if(j==i) {
					dp[i][j] = dp[i-1][j-1] + value;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j-1]+value, dp[i-1][j]+value);
				}
			} // for_j
		} // for_i
		
		int max = 0;
		for(int k=1 ; k<=floor ; k++) {
			if(max < dp[floor][k])
				max = dp[floor][k];
		}
		System.out.println(max);
		
	}

}

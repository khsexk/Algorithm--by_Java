package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			String s = Integer.toString(i);
			int sum = 0;
			
			for(int j=0 ; j<s.length() ; j++)
				sum += Character.getNumericValue(s.charAt(j));
			
			if(sum+Integer.parseInt(s) == N) {
				System.out.println(s);
				break;
			}
			if(i==N-1) { System.out.println(0); }
		}
		
		br.close();
	}

}



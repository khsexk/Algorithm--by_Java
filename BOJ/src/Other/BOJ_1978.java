package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int prime = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<N ; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(isPrime(n) && n>=2) {
				prime++;
			}
		}
		
		System.out.println(prime);

	}
	static boolean isPrime(int num) {
		int x = (int)Math.sqrt((double)num);
		
		for(int i=2 ; i<x+1 ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	

}

package Other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int s = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		for(int i=2 ; i<=f ; i++) {
			if(isPrime(i)) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	static boolean isPrime(int num) {
		int limit = (int)Math.sqrt(num);
		
		for(int i=2 ; i<limit+1 ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
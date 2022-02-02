package Brute_Force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 비트마스크 
public class BOJ_11723 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		
		int bitmap = 0;
		StringBuilder sb = new StringBuilder();
		
		while(M-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int num;
			
			switch(cmd) {
				case "add":
					num = Integer.parseInt(st.nextToken());
					bitmap |= (1 << (num-1));
					break;
				case "remove":
					num = Integer.parseInt(st.nextToken());
					bitmap &= ~(1 << (num-1));
					break;
				case "check":
					num = Integer.parseInt(st.nextToken());
					sb.append(((bitmap & (1<<num-1)) != 0) ? "1\n":"0\n");
					break;
				case "toggle":
					num = Integer.parseInt(st.nextToken());
					bitmap ^= (1 << (num-1));
					break;
				case "all":
					bitmap |= ~0;
					break;
				case "empty":
					bitmap &= ~1;
					break;
			}
		} // while
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}

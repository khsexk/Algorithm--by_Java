// 탑
package Stack;

import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Stack<Top> stack = new Stack<Top>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=1 ; i<=N ; i++) {
			int height = Integer.parseInt(st.nextToken());
			
			if(stack.isEmpty()) {
				sb.append("0");
				stack.push(new Top(height, i));
			} else {
				while(true) {
					if(stack.isEmpty()) {
						sb.append(" 0");
						stack.push(new Top(height, i));
						break;
					}
					
					Top top = stack.peek();
					
					if(top.height > height) {
						sb.append(" " + top.seq);
						stack.push(new Top(height, i));
						break;
					}
					else {
						stack.pop();
					}
				}  // while_true
			}
		}	// for_i
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	} // main
}

class Top {
	int height;
	int seq;
	
	Top(int height, int seq){
		this.height = height;
		this.seq = seq;
	}
}
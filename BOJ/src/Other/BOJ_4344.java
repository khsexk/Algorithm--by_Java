package Other;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_4344 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = null;

		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
			int stu_Num = Integer.parseInt(st.nextToken()); 
			int count = 0;
			double avg = 0; 
			double avg_Over; 
			
			int[] arr = new int[stu_Num]; 
            
			for (int j = 0; j < stu_Num; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score; 
				avg += score; 
			}
			avg = avg / stu_Num;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > avg) {
					count++;
				}
			}
			avg_Over = (double) count / stu_Num * 100; 
			System.out.printf("%.3f", avg_Over);
			System.out.println("%");
		}
	}
}
package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
 
public class BOJ_10989 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++)
			bw.write(arr[i] + "\n");
 
		bw.flush();
        bw.close();
        br.close();
	}
}
package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		ArrayList<Integer> getMoney = new ArrayList<>();
		
		for(int i=0 ; i<N ; i++) {
			getMoney.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(getMoney);
		
		int time = 0;
		
		for(int j=0 ; j<N ; j++) {
			int t = getMoney.get(j) * (N-j);
			time += t;
		}
		bw.write(Integer.toString(time));
		bw.flush();
		bw.close();
	}
}


/*
	Greedy 알고리즘 문제를 풀기 위해 문제집에서 골라 풀었는데, 너무 간단하고 쉽고 Greedy라고 하기도 애매한 문제였다.
	다만, Greedy 알고리즘을 공부하고 푸니 보자마자 활동시간 문제가 떠올랐다 . 
*/
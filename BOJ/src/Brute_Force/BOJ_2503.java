package Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2503 {
	static int correct = 0;
	static int possible = 9;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Case> list = new ArrayList<>();
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			list.add(new Case(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		// 100*100*9
		for(int j=0 ; j<N-1 ; j++) {
			for(int k=j+1 ; k<N ; k++) {
				
			}
		}
		possibleCase();
		br.close();
	}
	static void possibleCase() {
		if(correct == 0) {
			System.out.println(fact(possible) / fact(possible-3));
		}
		else if(correct == 1) {
			System.out.println(fact(possible) / fact(possible-2));
		}
		else if(correct ==2) {
			System.out.println(possible);
		}
		else {
			System.out.println(1);
		}
		return;
	}
	static int fact(int num) {
		if(num <= 1)
			return num;
		return num * fact(num-1);
	}
}

class Case{
	int answer;
	int strike;
	int ball;
	
	Case(int answer, int strike, int ball){
		this.answer = answer;
		this.strike = strike;
		this.ball = ball;
	}
}

package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2457 {
	static final int start = 301;
	static final int finish = 1201;
	static int current = 301;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Flower> flowerList = new ArrayList<>();
		int idx = 0;
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			flowerList.add(new Flower(Integer.valueOf(st.nextToken())*100 + Integer.valueOf(st.nextToken()),
									Integer.valueOf(st.nextToken())*100 + Integer.valueOf(st.nextToken())));
		}
		
		Collections.sort(flowerList);
		
		int minFlower = 0;
		boolean flag = false;
		
		while(current < finish) {
			int maxfinishTime = current;
			
			for(Flower flower : flowerList) {
				if(flower.startDate <= current && maxfinishTime < flower.finishDate) {
					maxfinishTime = flower.finishDate;
					flag = true;
				}
			} // for_Each
			
			if(flag) {
				current = maxfinishTime;
				minFlower++;
				flag = false;
			}
			else {
				minFlower = 0;
				break;
			}
		} // while
		bw.write(Integer.toString(minFlower));
		bw.flush();
		bw.close();
		br.close();
	}
}
class Flower implements Comparable<Flower>{
	int startDate;
	int finishDate;
	
	Flower(int startDate, int finishDate){
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	@Override
	public int compareTo(Flower f2) {
		if(this.startDate == f2.startDate) {
			return this.finishDate - f2.finishDate;
		}
		return this.startDate - f2.startDate;
	}
}

/*
처음부터 깔끔하게 정리해서(모든 예외 테스트케이스) 풀자,,,
*/

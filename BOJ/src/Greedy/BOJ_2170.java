package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2170 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		
		ArrayList<Line> list = new ArrayList<>();
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			list.add(new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		
		int startPnt = list.get(0).x;
		int endPnt = list.get(0).y;
		int length = endPnt - startPnt;
		
		for(int i=1 ; i<N ; i++) {
			int currentSP = list.get(i).x;
			int currentEP = list.get(i).y;
			
			// 겹칠 경우 
			if(currentSP >= startPnt && currentEP <= endPnt) {
				continue;
			}
			// 시작점이 이전의 선 안에 있을 때 
			else if(currentSP <= endPnt) {
				length += (currentEP - endPnt);
			}
			// 겹치지 않을 때 
			else {
				length += (currentEP - currentSP);
			}
			
			startPnt = currentSP;
            endPnt = currentEP;
		}
		
		/*  밑의 메모 참고 
		while(true) {
			int checkPnt = list.get(0).x;
			int idx = 0;
			
			for(Line l : list) {
				if(l.x <= endPnt && l.y >= endPnt) {
					endPnt = l.y;
					idx++;
				}
			} // forEach
			
			length += endPnt - checkPnt;
			
			// 모든 선이 이어져있을 때 
			if(idx == list.size()) {
				break;
			}
			// 끊어졌을 때 
			else {
				for(int j=0 ; j<idx ; j++) {
					list.remove(0);
				}
				endPnt = list.get(0).y;
			}
		} // while_true
		*/
		bw.write(Integer.toString(length));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
class Line implements Comparable<Line>{
	int x;
	int y;
	
	Line(int x, int y){
		this.x = x;	
		this.y = y;
	}
	@Override
	public int compareTo(Line l) {
		if(this.x - l.x == 0) {
			return this.y - l.y;
		}
		return this.x - l.x;
	}
}

/*
 * 	주석처리 된 코드 ☛ 처음에 직관적으로 풀어서 for문을 총 두번 사용하였다. (사실 Queue를 사용하고 싶었는데 sort가 안되고, Queue 사용했어도 시간초과가 났을 것이다.)
 * 시간초과로 오답처리 돼 for문을 한번만 쓰는 코드로 수정하였고, 정답처리되었따.
 * 그리디 문제를 총 3개 풀어보면서 이제 어느 정도 감이 잡힌 것 같다. 특히 활동시간문제(Activity-Selection Problem)이 왜 그리디 알고리즘의 
 * 대표적인 예인지 알것같다. (그리디 문제는 거의 모두 활동시간문제로 풀린다...!)
 * */

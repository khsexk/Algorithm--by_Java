package LinkedList;
import java.util.*;

// 시간초과 Solution
public class BOJ_5397 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Num = sc.nextLine();
		int N = Integer.parseInt(Num);
		String[] sArray = new String[N];
		
		for(int i=0 ; i<N ; i++) 
			sArray[i] = sc.nextLine();
		
		for(String s : sArray) {
			LinkedList<Character> list = new LinkedList<Character>();
			int idx = 0;
			
			for(int j=0 ; j<s.length() ; j++) {
				switch(s.charAt(j)) {
					case '<':
						if(idx != 0) idx--;
						break;
					case '>':
						if(idx!=list.size()) idx++;
						break;
					case '-':
						if(idx!=0) {
							list.remove(idx-1);
							idx--;
						}
						break;
					default:
						list.add(idx, s.charAt(j));
						idx++;
						break;
				}
			}
			StringBuilder sb = new StringBuilder();
			
			for(int z=0; z< list.size();z++)
				sb.append(list.get(z));
			System.out.println(sb);
		}
	}
}

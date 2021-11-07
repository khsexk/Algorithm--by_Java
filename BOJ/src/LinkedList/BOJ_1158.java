package LinkedList;
import java.util.*;

public class BOJ_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder("<");
		
		for(int i=1 ; i<=N ; i++) 
			list.add(i);
		
		while(!list.isEmpty()) {
			for(int i=0 ; i<K ; i++) {
				if(i==K-1)
					sb.append(list.poll());
				else {
					list.offer(list.poll());
				}
			}
			if(!list.isEmpty()) {
				sb.append(", ");
			}
		}
		System.out.println(sb.append(">").toString());
	}
}
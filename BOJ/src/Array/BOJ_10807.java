package Array;

import java.util.*;
public class BOJ_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> hash = new HashMap<>();
		
		for(int i=0 ; i<n ; i++) {
			int num = sc.nextInt();
			
			if(hash.containsKey(num)) 
				hash.replace(num, hash.get(num) + 1);
			else
				hash.put(num, 1);
		}
		int f = sc.nextInt();
		
		if(hash.containsKey(f))
			System.out.println(hash.get(f));
		else
			System.out.println(0);
	}
}

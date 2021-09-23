package Array;
import java.util.*;

public class BOJ_10808 {
	public static void main(String[] args) {
		int[] n = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i=0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			n[c-'a']++;
		}
		for(int i=0 ; i<n.length; i++) {
			System.out.print(n[i]);
			if(i != n.length-1)
				System.out.print(" ");
		}
	}
}

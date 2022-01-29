package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			if(!list.contains(s))
				list.add(s);
		}
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int result = o1.length() - o2.length();
				
				if(result == 0)
					return o1.compareTo(o2);
						
				return result;
			}
			
		});
		
		for(String s : list)
			System.out.println(s);
	}

}

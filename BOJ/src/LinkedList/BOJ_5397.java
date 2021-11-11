package LinkedList;
import java.util.*;
import java.io.*;

public class BOJ_5397 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			
			LinkedList<Character> list = new LinkedList<Character>();
			ListIterator<Character> listIter = list.listIterator();
			
			for(int j=0 ; j<s.length() ; j++) {
				switch(s.charAt(j)) {
					case '<':
						if(listIter.hasPrevious()) listIter.previous();
						break;
					case '>':
						if(listIter.hasNext()) listIter.next();
						break;
					case '-':
						if(listIter.hasPrevious()) {
							listIter.previous();
							listIter.remove();
						}
						break;
					default:
						listIter.add(s.charAt(j));
						break;
				}
			}
			
			for(char c: list)
				bw.write(c);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}

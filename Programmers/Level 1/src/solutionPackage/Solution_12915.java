package solutionPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution_12915 {
    public String[] solution(String[] strings, int n) {
		int len = strings.length;
		HashMap<Character, ArrayList<String>> map = new HashMap();
		
		for(int i=0 ; i<len ; i++) {
			char k = strings[i].charAt(n);
			ArrayList arrList;
			if(map.get(k) == null) {
				arrList = new ArrayList();
				arrList.add(strings[i]);
				map.put(k, arrList);
			}
			else {
				arrList = map.get(k);
				arrList.add(strings[i]);
				map.replace(k, arrList);
			}
		}
		
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		
		ArrayList<String> ansList = new ArrayList();
		
		for(int j=0 ; j<map.size() ; j++) {
			if(map.get(keys[j]).size() == 1) {
				ansList.add(map.get(keys[j]).get(0));
			}
			else {
				Object[] strArray = map.get(keys[j]).toArray();
				Arrays.sort(strArray);
				
				for(Object oj : strArray) {
					ansList.add((String)oj);
				}  // for_oj
			}
		}	// for_j
		
        String[] answer = new String[len];
		for(int l=0 ; l<len ; l++) 
			answer[l] = ansList.get(l);
		
        return answer;
    }
}
package solutionPackage;

import java.util.Collections;
import java.util.ArrayList;

public class Solution_12917 {
    public String solution(String s) {
        ArrayList<Character> s_str = new ArrayList();
        ArrayList<Character> l_str = new ArrayList();

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                s_str.add(s.charAt(i));
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                l_str.add(s.charAt(i));
        }
        Collections.sort(s_str, Collections.reverseOrder());
        Collections.sort(l_str, Collections.reverseOrder());
        
        String answer = "";
        for(int i=0 ; i<s_str.size() ; i++){
            answer += Character.valueOf(s_str.get(i));
        }
        for(int i=0 ; i<l_str.size() ; i++){
            answer += Character.valueOf(l_str.get(i));
        }
        
        return answer;
    }
}
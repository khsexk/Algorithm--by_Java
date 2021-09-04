package solutionPackage;
import java.util.*;

class Solution_17686 {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() { 
	        @Override 
	        public int compare(String s1, String s2) { 
                String head1 = s1.split("[0-9]")[0];
                String head2 = s2.split("[0-9]")[0];
                
                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                
                if(result == 0)
                    return returnNum(s1,head1) - returnNum(s2,head2);
                    
		        return result; 
	        } 
        });
        return files;
    } // solution
    int returnNum(String file, String head){
        file = file.replace(head, "");
        String number = "";
        
        for(char c : file.toCharArray()){
            if(Character.isDigit(c) && number.length() < 5) number += c;
            else break;
        }
        return Integer.parseInt(number);
    }
}

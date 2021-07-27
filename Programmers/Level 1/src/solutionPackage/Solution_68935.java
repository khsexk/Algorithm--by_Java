package solutionPackage;

public class Solution_68935 {
    public int solution(int n) {
		String base_3s = "";
		
		if(n<3) 
			return n;
		
		while(true) {
			base_3s += Integer.toString(n%3);
			n /= 3;
			if(n < 3) {
				base_3s += Integer.toString(n);
				break;
			}
		}
		int answer = 0;
		
		for(int i=0 ; i<base_3s.length() ; i++) 
			answer += sqrt(base_3s.length()-1-i) * Character.getNumericValue(base_3s.charAt(i));
        
        return answer;
    }
	
	public int sqrt(int s) {
		int q = 1;
		if(s==0) 
			return 1;
		for(int i=0 ; i<s ; i++) 
			q *= 3;
		return q;
	}
}
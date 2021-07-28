package solutionPackage;
import java.util.HashMap;

public class Solution_12901 {
    public String solution(int a, int b) {
        HashMap<Integer, String> day = new HashMap<Integer, String>();
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");
        day.put(0, "THU");
        day.put(1, "FRI");
        day.put(2, "SAT");
        
        int date = 0;
        
        for(int i=1 ; i<=a ; i++){
            if(i==a)
                date += b;
            else{
                if(i == 2)
                    date += 29;
                else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                    date += 31;
                else
                    date += 30;
            }
        }
        
        String answer = day.get(date%7);
        return answer;
    }
}
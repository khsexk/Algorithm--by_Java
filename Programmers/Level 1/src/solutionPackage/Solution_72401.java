package solutionPackage;

public class Solution_72401 {
    public String solution(String new_id) {
        String answer = recommendation(new_id);

        return answer;
    }
    public String recommendation(String id){
        id = firStep(id);
        id = secStep(id);
        id = trdStep(id);
        id = fothStep(id);
        id = fthStep(id);
        id = sthStep(id);
        id = sevthStep(id);
        return id;
    } // Recommend Step
    public String firStep(String id){
        String firId = "";
        for(int i=0 ; i<id.length() ; i++){
            if(id.charAt(i) >= 65 && id.charAt(i)<=90) {
                int c = id.charAt(i) + 32;
                firId += (char)c;
            }else{
                firId += id.charAt(i);
            }
        }
        return firId;
    } // First Step
    
    public String secStep(String id){
        String secId = "";
        for(int i=0 ; i<id.length() ; i++){
            if(id.charAt(i) >= 97 && id.charAt(i)<=122) 
                secId += id.charAt(i);
            else if(id.charAt(i) >= 48 && id.charAt(i)<=57) 
                secId += id.charAt(i);
            else if(id.charAt(i) == '-' || id.charAt(i) == '_' || id.charAt(i) == '.')
                secId += id.charAt(i);
        }
        return secId;
    } // Second Step
    public String trdStep(String id){
        String trdId = "";
        trdId += id.charAt(0);
            
        for(int i=1 ; i<id.length() ; i++){
            if(id.charAt(i) == '.'){
                if(id.charAt(i-1) != '.')
                    trdId += id.charAt(i);
            }
            else
                trdId += id.charAt(i);
        }
        return trdId;
    } // Third Step
    public String fothStep(String id){
        String fothId = "";
        int idx = 0;
        
        while(idx<id.length()){
            if(id.charAt(idx) == '.')
                idx++;
            else{
                while(idx<id.length()){
                    if(idx==id.length()-1 && id.charAt(idx)=='.')
                        break;
                    fothId += id.charAt(idx);
                    idx++;
                } // while
                break;
            }
        } // while
        return fothId;
    } // Fourth Step
    public String fthStep(String id){
        if(id.length() == 0)
            return "a";
        else
            return id;
    } // Fifth Step
    public String sthStep(String id){
        String sixthId = "";
        if(id.length() < 16)
            return id;
        else{
            for(int i=0 ; i< 15 ; i++)
                sixthId += id.charAt(i);
            sixthId = fothStep(sixthId);
        }
        return sixthId;
    } // Sixth Step
    public String sevthStep(String id){
        if(id.length() > 2){
            return id;
        }
        else{
            char c = id.charAt(id.length()-1);
            while(true){
                id += c;
                if(id.length() == 3)
                    break;
            }
            return id;   
        }        
    } // Seventh Step
}
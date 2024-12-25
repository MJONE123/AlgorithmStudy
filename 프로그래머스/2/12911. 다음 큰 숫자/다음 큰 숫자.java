import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String st = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == '1')
                cnt++;
        }
        
        for(int i=n+1; i<=10000000; i++)
        {
            String str = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1')
                    count++;
            }
            if(count == cnt){
                answer = i;
                break;
            }
                
        }
        
        return answer;
    }
}

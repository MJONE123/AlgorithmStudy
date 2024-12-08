class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int newCoupon = chicken;
        int remainCoupon = 0;
        
        while(newCoupon + remainCoupon >= 10) {
            int a = (newCoupon + remainCoupon) / 10;
            int b = (newCoupon + remainCoupon) % 10;
            
            newCoupon = a;
            remainCoupon = b;
            
            answer += newCoupon;
        }
        
        return answer;
    }
}
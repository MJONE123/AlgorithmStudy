class Solution {
    public long solution(int n) {
        int [] a = new int [2001];
        a[0]=1; a[1]=2;
        for(int i =2; i<=n; i++) {
            a[i] = (a[i-2]+ a[i-1])%1234567;
        }
        return (a[n-1]);
    }
}